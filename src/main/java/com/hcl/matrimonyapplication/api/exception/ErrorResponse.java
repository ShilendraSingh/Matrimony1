package com.hcl.matrimonyapplication.api.exception;

public class ErrorResponse {
	
	private String message;
	private String path;
	private int statusCode;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	public ErrorResponse(String message, String path, int statusCode) {
		super();
		this.message = message;
		this.path = path;
		this.statusCode = statusCode;
	}



	

	
	

}
