package com.hcl.matrimonyapplication.api.controller;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.matrimonyapplication.api.dto.CreateProfileDTO;
import com.hcl.matrimonyapplication.api.dto.ProfileSuccessResponseDto;
import com.hcl.matrimonyapplication.api.dto.ResponseDTO;
import com.hcl.matrimonyapplication.api.service.CreateProfileServiceImpl;
import com.hcl.matrimonyapplication.api.service.SearchProfileServiceImpl;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes = { TestContext.class, UserController.class })
@WebAppConfiguration
public class CreateProfileControllerTest {

	@InjectMocks
	CreateProfileController createProfileController;

	private MockMvc mockMvc;

	@Mock
	CreateProfileServiceImpl createProfileServiceImpl;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(createProfileController).build();

	}

	@Test
	public void searchProfileTest() throws Exception {

		int age =25;
		String caste = "general";
		String motherTongue="hindi";
		ProfileSuccessResponseDto response  = new ProfileSuccessResponseDto();
		response.setStatusCode(200);
		
	      Mockito.when(SearchProfileServiceImpl.searchProfileByAgeOrCasteOrMotherTongue(Mockito.anyInt(), Mockito.anyString(), Mockito.anyString())).thenReturn(response);
	
			this.mockMvc.perform(MockMvcRequestBuilders.get("/matrimony/searchProfile/",age,caste,motherTongue)
					.contentType(MediaType.APPLICATION_JSON).content(asJsonString(age))).andReturn();
			
			ResponseEntity<ProfileSuccessResponseDto> object  = createProfileController.searchProfile(age, caste, motherTongue);
			
			assertEquals(200, object.getStatusCodeValue());
	}
	

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Test
	public void TestCreateProfile() {
		
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
		
		
		ResponseDTO responseDTO = new ResponseDTO();
		
		responseDTO.setMessage("Sucess");
		responseDTO.setStatusCode(200);
		
		
		Mockito.when(createProfileServiceImpl.create(Mockito.any())).thenReturn(responseDTO);
		
		ResponseEntity<ResponseDTO> ResponseDTO=createProfileController.createprofile(CreateProfileDTO);
		assertEquals("user created successfullly", ResponseDTO.getStatusCode());
		
}
	

}