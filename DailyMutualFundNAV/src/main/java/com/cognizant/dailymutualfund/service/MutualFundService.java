package com.cognizant.dailymutualfund.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dailymutualfund.controller.AuthClient;
import com.cognizant.dailymutualfund.exception.MutualFundNotFoundException;
import com.cognizant.dailymutualfund.model.AuthResponse;
import com.cognizant.dailymutualfund.model.MutualFund;
import com.cognizant.dailymutualfund.repository.MutualFundRepository;

/**
 * This is the service layer interface
 * @author Ruksar, Revathi, Rameswara, Prachi
 *
 */
public interface MutualFundService {
	
	public List<MutualFund> getAllMutualFund() ;
	
	public MutualFund getMutualFundByName(String mutualFundName) throws MutualFundNotFoundException;
	
	public MutualFund getMutualFundById(String mutualFundId);
	
	public List<Double> getMutualFundByIdList(List<String> mutualFundIdList);
	
	public Boolean isSessionValid(String token);

}
