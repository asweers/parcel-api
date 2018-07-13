package com.sweers.parcel.api.residential;

import javax.persistence.Entity;

import com.sweers.parcel.api.address.Address;
import com.sweers.parcel.api.parcel.Parcel;

@Entity
public class Residential extends Parcel {

	private Integer yearBuilt;
	
	public Residential() {
		super();
	}
	
	public Residential(Long id, String alternateId, Address address, String county, Integer value, String condition, Integer yearBuilt) {
		super(id, alternateId, address, county, value, condition);
		this.yearBuilt = yearBuilt;
	}

	public Integer getYearBuilt() {
		return yearBuilt;
	}
	public void setYearBuilt(Integer yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
}
