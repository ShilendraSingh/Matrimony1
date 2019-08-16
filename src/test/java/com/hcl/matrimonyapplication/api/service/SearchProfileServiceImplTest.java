package com.hcl.matrimonyapplication.api.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.matrimonyapplication.api.dto.ProfileSuccessResponseDto;
import com.hcl.matrimonyapplication.api.entity.CreateProfile;
import com.hcl.matrimonyapplication.api.repository.CreateProfileRepository;

@RunWith(MockitoJUnitRunner.class)
public class SearchProfileServiceImplTest {
	@Mock
	CreateProfileRepository createProfileRepository;
	@InjectMocks
	SearchProfileServiceImpl searchProfileServiceImpl;
	
	@Test
	public void searchProfileByAgeOrCasteOrMotherTongueTest()
	{
		CreateProfile profile = new CreateProfile();
		profile.setAge(25);
		List<CreateProfile> list = new ArrayList<>();
		
		Mockito.when(createProfileRepository.searchProfileByAgeOrCasteOrMotherTongue(Mockito.anyInt(), Mockito.anyString(), Mockito.anyString())).thenReturn(list);
		ProfileSuccessResponseDto response = 	searchProfileServiceImpl.searchProfileByAgeOrCasteOrMotherTongue(25, "general", "hindi");
		assertEquals(200, response.getStatusCode());
	}

}
