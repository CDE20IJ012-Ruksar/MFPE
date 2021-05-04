package com.cognizant.dailymutualfund.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cognizant.dailymutualfund.controller.AuthClient;
import com.cognizant.dailymutualfund.exception.MutualFundNotFoundException;
import com.cognizant.dailymutualfund.model.AuthResponse;
import com.cognizant.dailymutualfund.model.MutualFund;
import com.cognizant.dailymutualfund.repository.MutualFundRepository;

//@RunWith(SpringRunner.class)
@SpringBootTest
class MutualFundServiceImplTests {

	@Autowired
	private MutualFundServiceImpl serviceImpl;
	@Mock
	AuthClient authClient;
	@MockBean
	private MutualFundRepository repository;
	
	/**
	 * This method is used to test the serviceImpl getMutualFundbyName method 
	 * @throws MutualFundNotFoundException 
	 */
	@Test
	public void testgetMutualFundbyName() throws MutualFundNotFoundException {
		MutualFund mutualFund=new MutualFund("AXIS","Axis Bluechip fund",9800.0);
    	Mockito.when(repository.findByMutualFundName("Axis Bluechip fund")).thenReturn(mutualFund);
		assertThat(serviceImpl.getMutualFundByName("Axis Bluechip fund")).isEqualTo(mutualFund);
		
	}
	
	/**
	 * 
	 */
	@Test
	public void testgetMutualFundbyNameNull() throws MutualFundNotFoundException {
		/*MutualFund mutualFund=new MutualFund();
		mutualFund.setMutualFundId("AXIS");
		mutualFund.setMutualFundName("Axis Bluechip fund");
		mutualFund.setMutualFundValue(9800.0);
		*/
		//Mockito.when(repository.findByMutualFundName(null)).thenThrow(MutualFundNotFoundException.class);
		//assertThat(serviceImpl.getMutualFundByName("Axis Bluechip fund")).isEqualTo(mutualFund);
		
	}
	
	
	/**
	 * This method is used to test the serviceImpl getMutualFundbyId method 
	 */
	@Test
	public void testgetMutualFundbyId() {
		MutualFund mutualFund=new MutualFund("AXIS","Axis Bluechip fund",9800.0);
		Mockito.when(repository.findByMutualFundId("AXIS")).thenReturn(mutualFund);
		assertThat(serviceImpl.getMutualFundById("AXIS")).isEqualTo(mutualFund);
		
	}
	
	/**
	 * This method is used to test the serviceImpl getAllMutualFund method 
	 */
	@Test
	public void testgetAllMutalFund()
	{
		List<MutualFund> mutualFundList=new ArrayList<>();
		mutualFundList.add(new MutualFund("AXIS","Axis Bluechip fund",9800.0));
		mutualFundList.add(new MutualFund("DSP","DSP Midcap Fund",6000.0));
		mutualFundList.add(new MutualFund("DSP","DSP Midcap Fund",6000.0));
		Mockito.when(repository.findAll()).thenReturn(mutualFundList);
		assertThat(serviceImpl.getAllMutualFund()).isEqualTo(mutualFundList);
	}
	
	@Test
	void isSessionValid()
	{
		when(authClient.getValidity("token")).thenReturn(new AuthResponse("101","pwd",true));
		assertEquals(false,serviceImpl.isSessionValid("token"));
	}

}
