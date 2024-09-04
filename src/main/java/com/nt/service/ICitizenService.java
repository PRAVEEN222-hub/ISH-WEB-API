package com.nt.service;

import com.nt.binding.CitizenData;
import com.nt.exp.InvalidSSNException;

public interface ICitizenService {
	
	public Integer userRegistration(CitizenData data)throws InvalidSSNException;

}
