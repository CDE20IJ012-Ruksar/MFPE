package com.cognizant.dailymutualfund.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * This is a model class for authenticated response 
 * @author Ruksar, Revathi, Rameswara, Prachi
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class AuthResponse {

	private String uid;

	private String name;

	private boolean isValid;

	

}
