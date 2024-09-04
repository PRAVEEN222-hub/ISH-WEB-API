package com.nt.binding;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


public class CitizenData {


	private String fullName;
	private String gender;
	private String stateName;
	private String email;
	private LocalDate createDate;
	private LocalDate endDate;
	private LocalDate createdBy;
	private LocalDate updatedBy;
	private Long ssn;
	private Long phNo;
	private Integer caseNo;
	
	
	public CitizenData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CitizenData(String fullName, String gender, String stateName, String email, LocalDate createDate,
			LocalDate endDate, LocalDate createdBy, LocalDate updatedBy, Long ssn, Long phNo, Integer caseNo) {
		super();
		this.fullName = fullName;
		this.gender = gender;
		this.stateName = stateName;
		this.email = email;
		this.createDate = createDate;
		this.endDate = endDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.ssn = ssn;
		this.phNo = phNo;
		this.caseNo = caseNo;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
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
	@Override
	public String toString() {
		return "CitizenData [fullName=" + fullName + ", gender=" + gender + ", stateName=" + stateName + ", email="
				+ email + ", createDate=" + createDate + ", endDate=" + endDate + ", createdBy=" + createdBy
				+ ", updatedBy=" + updatedBy + ", ssn=" + ssn + ", phNo=" + phNo + ", caseNo=" + caseNo + "]";
	} 



}
