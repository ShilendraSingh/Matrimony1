package com.hcl.matrimonyapplication.api.dto;

import java.util.Date;

public class CreateProfileDTO {
	
	
	private String name;
	private String gender;
	private int age;
	private String emailId;
	private Long mobileNo;
	private String addressLocal;
	private Date dob;
	private String religion;
	private String caste;
	private String subcast;
	private String motherTongue;
	private boolean isDrinker;
	private boolean isSmoker;
	private double annualIncome;
	private String profession;
	private boolean isNRI;
	private String foodHabit;
	private String NRIDetails;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddressLocal() {
		return addressLocal;
	}
	public void setAddressLocal(String addressLocal) {
		this.addressLocal = addressLocal;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getSubcast() {
		return subcast;
	}
	public void setSubcast(String subcast) {
		this.subcast = subcast;
	}
	public String getMotherTongue() {
		return motherTongue;
	}
	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}
	public boolean isDrinker() {
		return isDrinker;
	}
	public void setDrinker(boolean isDrinker) {
		this.isDrinker = isDrinker;
	}
	public boolean isSmoker() {
		return isSmoker;
	}
	public void setSmoker(boolean isSmoker) {
		this.isSmoker = isSmoker;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public boolean isNRI() {
		return isNRI;
	}
	public void setNRI(boolean isNRI) {
		this.isNRI = isNRI;
	}
	public String getFoodHabit() {
		return foodHabit;
	}
	public void setFoodHabit(String foodHabit) {
		this.foodHabit = foodHabit;
	}
	public String getNRIDetails() {
		return NRIDetails;
	}
	public void setNRIDetails(String nRIDetails) {
		NRIDetails = nRIDetails;
	}

	

}
