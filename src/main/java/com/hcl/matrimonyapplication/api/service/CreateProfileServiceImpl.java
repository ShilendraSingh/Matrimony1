package com.hcl.matrimonyapplication.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.matrimonyapplication.api.dto.CreateProfileDTO;
import com.hcl.matrimonyapplication.api.dto.ResponseDTO;
import com.hcl.matrimonyapplication.api.entity.CreateProfile;
import com.hcl.matrimonyapplication.api.repository.CreateProfileRepository;

@Service
public class CreateProfileServiceImpl implements CreateProfileService {
	
	private static final Logger logger = LoggerFactory.getLogger(CreateProfileServiceImpl.class);

	@Autowired
	private CreateProfileRepository createProfileRepository;
	
	@Override
	public ResponseDTO create (CreateProfileDTO createProfileDTO) {
		
		logger.info("inside the createProfile method in serviceImpl");
		// TODO Auto-generated method stub
		CreateProfile creteProfile=new CreateProfile();
		
		ResponseDTO responseDTO=new ResponseDTO();
		
		
// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//String  currentDateTime =formatter.toFormat(createProfileDTO.getDob()); 
	
		BeanUtils.copyProperties(createProfileDTO, creteProfile);
		 createProfileRepository.save(creteProfile);
		 responseDTO.setMessage("user created successfullly");
		 responseDTO.setStatusCode(200);
		 return responseDTO;
		 
		 
	}

}
