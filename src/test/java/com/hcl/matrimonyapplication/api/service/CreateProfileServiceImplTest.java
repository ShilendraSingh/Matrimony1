package com.hcl.matrimonyapplication.api.service;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hcl.matrimonyapplication.api.dto.CreateProfileDTO;
import com.hcl.matrimonyapplication.api.dto.ResponseDTO;
import com.hcl.matrimonyapplication.api.entity.CreateProfile;
import com.hcl.matrimonyapplication.api.repository.CreateProfileRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class CreateProfileServiceImplTest {
	
	@Mock
	private CreateProfileRepository createProfileRepository;
	
	@InjectMocks
	CreateProfileServiceImpl createProfileServiceImpl;
	
	
	
	
	@Test
	public void test()
		{
		CreateProfileDTO CreateProfileDTO=new CreateProfileDTO();
		CreateProfileDTO.setAddressLocal("BTM");
		CreateProfileDTO.setDob(new Date(0));
		CreateProfileDTO.setAge(23);
		CreateProfileDTO.setAnnualIncome(900000);
		CreateProfileDTO.setCaste("HIndu");
		CreateProfileDTO.setDrinker(false);
		CreateProfileDTO.setEmailId("a@a.com");
		CreateProfileDTO.setFoodHabit("veg");
		CreateProfileDTO.setGender("male");
		CreateProfileDTO.setMobileNo(8970297757L);
		CreateProfileDTO.setMotherTongue("hindi");
		CreateProfileDTO.setName("shashank");
		CreateProfileDTO.setNRI(true);
		CreateProfileDTO.setNRIDetails("NRI");
		CreateProfileDTO.setProfession("sE");
		CreateProfileDTO.setReligion("hindu");
		CreateProfileDTO.setSmoker(false);
		CreateProfileDTO.setSubcast("brahamim");
		
		
		
		CreateProfile createProfile = new CreateProfile();
		createProfile.setAddressLocal("bangalore");
		createProfile.setAge(10);
		createProfile.setCaste("aas");
		createProfile.setEmailId("abc@gmail.com");
		createProfile.setFoodHabit("hjsdf");
		createProfile.setMotherTongue("sdf");
		createProfile.setDob((new Date(0)));
		createProfile.setAddressLocal("239857");
		createProfile.setDrinker(false);
		createProfile.setNRI(false);
		createProfile.setSmoker(false);
		createProfile.setGender("Male");
		createProfile.setMobileNo(23546L);
		createProfile.setName("sgd");
		createProfile.setProfession("rgvgrf");
		createProfile.setNRIDetails("sfd");
		
		
		Mockito.when(createProfileRepository.save(Mockito.any())).thenReturn(createProfile);
			
			ResponseDTO ResponseDTO=createProfileServiceImpl.create(CreateProfileDTO);
			assertEquals("user created successfullly", ResponseDTO.getMessage());
			
		}
	}

