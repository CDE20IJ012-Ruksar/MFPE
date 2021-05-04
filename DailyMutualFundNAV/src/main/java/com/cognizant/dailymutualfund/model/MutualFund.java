package com.cognizant.dailymutualfund.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * This is the model class for MutualFund 
 * @author Ruksar, Revathi, Rameswara, Prachi
 *
 */
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MutualFund {
	@Id
	@Column
	private String mutualFundId;
	@Column
	private String mutualFundName;
	@Column
	private double mutualFundValue;
	
	
}
