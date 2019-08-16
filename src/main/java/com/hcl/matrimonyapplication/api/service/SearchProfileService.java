package com.hcl.matrimonyapplication.api.service;

import com.hcl.matrimonyapplication.api.dto.ProfileSuccessResponseDto;

public interface SearchProfileService {
	
	public ProfileSuccessResponseDto searchProfileByAgeOrCasteOrMotherTongue(int age,String caste,String motherTongue);
	
	

}
