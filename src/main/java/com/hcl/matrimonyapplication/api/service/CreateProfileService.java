package com.hcl.matrimonyapplication.api.service;

import org.springframework.stereotype.Service;

import com.hcl.matrimonyapplication.api.dto.CreateProfileDTO;
import com.hcl.matrimonyapplication.api.dto.ResponseDTO;

@Service
public interface CreateProfileService {
	
	public ResponseDTO create(CreateProfileDTO createProfileDTO);

}
