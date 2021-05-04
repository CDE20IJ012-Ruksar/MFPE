package com.cognizant.dailymutualfund.controller;

 
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.context.junit4.SpringRunner;
import com.cognizant.dailymutualfund.controller.AuthClient;
import com.cognizant.dailymutualfund.controller.MutualFundController;
import com.cognizant.dailymutualfund.model.AuthResponse;
import com.cognizant.dailymutualfund.model.MutualFund;
import com.cognizant.dailymutualfund.repository.MutualFundRepository;
import com.cognizant.dailymutualfund.service.MutualFundService;
import com.cognizant.dailymutualfund.service.MutualFundServiceImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(value = MutualFundController.class)
class MutualFundControllerTests {

	@MockBean
	MutualFundServiceImpl mutualFundServiceImpl;
	
	@Autowired
    private MockMvc mvc;
    
    @MockBean
   AuthClient authClient;
    
    List<MutualFund> list=new ArrayList<MutualFund>();
    
    /**
     * This method is testing to get all mutual funds
     * @throws Exception
     */
    @Test
    public void testGetDailyAllMutualFundNav() throws Exception {
        list.add(new MutualFund("123","MF1", 50000));
        List<String> mlist=new ArrayList<String>();
        mlist.add("SBI");
        mlist.add("AXIS");
        AuthResponse response1 = new AuthResponse("uid", "uname", true);
        when(authClient.getValidity("token")).thenReturn(response1);
        ResultActions actions = mvc.perform(get("/dailyAllMutualFundNav").header("Authorization", "token"));//.andReturn();
        actions.andExpect(status().isUnauthorized());
     
    }
    
    /**
     * This method is testing to get mutual fund detail of a particular name passed
     * @throws Exception
     */
    
    @Test
	public void testgetDailyMutualFundByName() throws Exception 
	{
    	MutualFund mutualFund=new MutualFund("AXIS","Axis Bluechip fund",9800.0);
		AuthResponse response1 = new AuthResponse("uid", "uname", true);
       when(authClient.getValidity("token")).thenReturn(response1);
		when(mutualFundServiceImpl.getMutualFundByName("Axis Bluechip fund")).thenReturn(mutualFund);
		ResultActions actions =mvc.perform(
				MockMvcRequestBuilders.get("/dailyMutualFundNav/name/Axis Bluechip fund")
				.content(this.mapToJson(mutualFund))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.header("Authorization", "token")
				).andExpect(status().isOk());
		
	}
    
    @Test
   	public void testgetMutualFundById() throws Exception 
   	{
       	MutualFund mutualFund=new MutualFund("AXIS","Axis Bluechip fund",9800.0);
   		AuthResponse response1 = new AuthResponse("uid", "uname", true);
         when(authClient.getValidity("token")).thenReturn(response1);
   		when(mutualFundServiceImpl.getMutualFundByName("AXIS")).thenReturn(mutualFund);
   		ResultActions actions =mvc.perform(
   				MockMvcRequestBuilders.get("/dailyMutualFundNav/id/AXIS")
   				.content(this.mapToJson(mutualFund))
   				.contentType(MediaType.APPLICATION_JSON)
   				.accept(MediaType.APPLICATION_JSON)
   				.header("Authorization", "token")
   				).andExpect(status().isOk());
   		
   	}

    /**
	 * Maps object into JSON string.Uses Jackson ObjectMapper	
	 */
	private String mapToJson(Object object) throws JsonProcessingException{
		ObjectMapper objectMapper=new ObjectMapper();
		return objectMapper.writeValueAsString(object);
	}

 

 

}