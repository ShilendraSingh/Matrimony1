package com.hcl.matrimonyapplication.api.dto;

import java.util.List;

import lombok.Data;

/**
 * 
 * @author Sushil
 *
 */
public class ProfileSuccessResponseDto {

	private int statusCode;
	private String status;
	private String message;
	private List<CreateProfileResponse> profileResponse;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<CreateProfileResponse> getProfileResponse() {
		return profileResponse;
	}
	public void setProfileResponse(List<CreateProfileResponse> profileResponse) {
		this.profileResponse = profileResponse;
	}
	
	
}
