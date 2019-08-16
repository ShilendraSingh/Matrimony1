package com.hcl.matrimonyapplication.api.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/***
 * @author Anuradha
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity


public class User {
	
private static final Logger logger = LoggerFactory.getLogger(User.class);



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "password")
	private String password;
	
	public String getUserId() {
		
		logger.info("inside the User entity");
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + "]";
	}
	public Long getProfileId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
