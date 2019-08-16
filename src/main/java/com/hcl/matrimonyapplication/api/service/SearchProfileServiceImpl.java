package com.hcl.matrimonyapplication.api.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.matrimonyapplication.api.dto.CreateProfileResponse;
import com.hcl.matrimonyapplication.api.dto.ProfileSuccessResponseDto;
import com.hcl.matrimonyapplication.api.entity.CreateProfile;
import com.hcl.matrimonyapplication.api.repository.CreateProfileRepository;
/**
 * 
 * @author Sushil
 *
 */
@Service
public class SearchProfileServiceImpl implements SearchProfileService {
	
	@Autowired
	CreateProfileRepository createProfileRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(SearchProfileServiceImpl.class);

	//this method is use to search profile base on age, caste and mothertongue
	@Override
	public ProfileSuccessResponseDto searchProfileByAgeOrCasteOrMotherTongue(int age, String caste,String motherTongue) {
		// TODO Auto-generated method stub
		logger.info("inside searchProfileByAgeOrCasteOrMotherTongue method");
		
		List<CreateProfile>   list = createProfileRepository.searchProfileByAgeOrCasteOrMotherTongue(age, caste, motherTongue);
		logger.info("data : "+list.size());
		//create object of CreateProfileResponse
		CreateProfileResponse profileResponse = new CreateProfileResponse();
		List<CreateProfileResponse> listprofileResponse= new ArrayList<CreateProfileResponse>();
		
		for (CreateProfile createProfile : list) {
			logger.info("data : "+createProfile);
			profileResponse.setName(createProfile.getName());
			profileResponse.setAddress(createProfile.getAddressLocal());
			profileResponse.setAnnualIncome(createProfile.getAnnualIncome());
			profileResponse.setProfession(createProfile.getProfession());
			profileResponse.setMobileNo(createProfile.getMobileNo().toString());
			listprofileResponse.add(profileResponse);
			
			
		}
		//create object for ProfileSuccessResponseDto
		ProfileSuccessResponseDto responseDto = new ProfileSuccessResponseDto();
		responseDto.setStatus("Success");
		responseDto.setStatusCode(200);
		responseDto.setProfileResponse(listprofileResponse);
		responseDto.setMessage("match data");
		return responseDto;
	}
	
	

}
