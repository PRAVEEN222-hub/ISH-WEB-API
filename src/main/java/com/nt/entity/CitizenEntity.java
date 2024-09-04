package com.nt.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="CITIZEN_APPLICATION")
public class CitizenEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer appId;
	private String fullName;
	private String stateName;
	private String gender;
	private String email;
	private LocalDate createDate;
	private LocalDate endDate;
	private LocalDate createdBy;
	private LocalDate updatedBy;
	private Long ssn;
	private Long phNo;
	private Integer caseNo;
	
	public CitizenEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CitizenEntity(Integer appId, String fullName, String stateName, String gender, String email,
			LocalDate createDate, LocalDate endDate, LocalDate createdBy, LocalDate updatedBy, Long ssn, Long phNo,
			Integer caseNo) {
		super();
		this.appId = appId;
		this.fullName = fullName;
		this.stateName = stateName;
		this.gender = gender;
		this.email = email;
		this.createDate = createDate;
		this.endDate = endDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.ssn = ssn;
		this.phNo = phNo;
		this.caseNo = caseNo;
	}
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public LocalDate getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(LocalDate createdBy) {
		this.createdBy = createdBy;
	}
	public LocalDate getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(LocalDate updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Long getSsn() {
		return ssn;
	}
	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}
	public Long getPhNo() {
		return phNo;
	}
	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}
	public Integer getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(Integer caseNo) {
		this.caseNo = caseNo;
	} 
	

}
