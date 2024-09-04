package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.nt.binding.CitizenData;
import com.nt.entity.CitizenEntity;
import com.nt.exp.InvalidSSNException;
import com.nt.repo.ICitizenRepo;

import reactor.core.publisher.Mono;
import reactor.netty.channel.ChannelOperations.OnSetup;
@Service
public class CitizenServiceImpl implements ICitizenService {
	@Autowired
	private ICitizenRepo citizenRepo;
	//@Autowired
//private RestTemplate tamplate;
	
	@Autowired
	private WebClient webClient;
	
	
	
	@Value("${ar.ssa-web.url}")
	private String endpointUrl;
	
	@Value("${ar.state}")	
	private String targetStae;

	
	@Override
	public Integer userRegistration(CitizenData data)throws InvalidSSNException{
		//ResponseEntity<String> response=webClient.exchange(endpointUrl,HttpMethod.GET, null,String.class,data.getSsn());
		//get stateName
		Mono<String> response=webClient.get().uri(endpointUrl,data.getSsn()).
				retrieve().onStatus(HttpStatus.BAD_REQUEST::equals, res-> res.bodyToMono(String.class).map(ex-> new InvalidSSNException("Invalid SSN"))).bodyToMono(String.class);
						
			String stateName=response.block();
		//register citizen Califorina State
		if(stateName.equalsIgnoreCase(targetStae)) {
			CitizenEntity entity=new CitizenEntity();
		BeanUtils.copyProperties(data, entity);
		entity.setStateName(stateName);
		
		System.out.println(entity);
		//save the object
		int appid=citizenRepo.save(entity).getAppId();
		return appid;
		}
		throw new InvalidSSNException("invalid ssn");
		
	  
	}

}
