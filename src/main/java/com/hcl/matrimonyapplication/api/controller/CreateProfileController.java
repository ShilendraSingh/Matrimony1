package com.hcl.matrimonyapplication.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.matrimonyapplication.api.dto.CreateProfileDTO;
import com.hcl.matrimonyapplication.api.dto.ProfileSuccessResponseDto;
import com.hcl.matrimonyapplication.api.dto.ResponseDTO;
import com.hcl.matrimonyapplication.api.service.CreateProfileService;
import com.hcl.matrimonyapplication.api.service.SearchProfileService;



@RestController
@RequestMapping("/matrimony")
@CrossOrigin(origins = "*")
public class CreateProfileController {
	private static final Logger logger = LoggerFactory.getLogger(CreateProfileController.class);
	
	@Autowired
	private CreateProfileService createProfileService ;
	
	@Autowired
	SearchProfileService searchProfileService;
	
	@PostMapping("/createProfile")
	public ResponseEntity<ResponseDTO> createprofile(@RequestBody CreateProfileDTO ProfileProfileDTO){
		logger.info("Create Profile METHOD--Controller!!!!!!!!!!!!!!!!!!");
		
		ResponseDTO ResponseDTO=createProfileService.create(ProfileProfileDTO);
		return new ResponseEntity<>( ResponseDTO,HttpStatus.OK);

	}
	
	@GetMapping("/searchProfile/{age}/{caste}/{motherTongue}")
	public ResponseEntity<ProfileSuccessResponseDto> searchProfile(@PathVariable(required=false) int age ,@PathVariable(required=false) String caste,@PathVariable(required=false) String motherTongue)
	{
		ProfileSuccessResponseDto responseDto = searchProfileService.searchProfileByAgeOrCasteOrMotherTongue(age, caste, motherTongue);
		return new ResponseEntity<ProfileSuccessResponseDto>(responseDto, HttpStatus.OK);
	}

}