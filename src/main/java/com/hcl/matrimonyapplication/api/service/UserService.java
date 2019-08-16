package com.hcl.matrimonyapplication.api.service;

import org.springframework.stereotype.Service;


import com.hcl.matrimonyapplication.api.dto.UserDTO;
import com.hcl.matrimonyapplication.api.dto.UserDetailDTO;

/***
 * 
 * @author Anuradha
 *
 */

@Service
public interface UserService {
	
	public UserDetailDTO registerUser(UserDTO userDto);

	public String loginUser(String userId, String password);

}
