package com.sweers.parcel.api.apartment;

import javax.persistence.Entity;

import com.sweers.parcel.api.address.Address;
import com.sweers.parcel.api.parcel.Parcel;

@Entity
public class Apartment extends Parcel {

	private Integer units;
	private Integer yearBuilt;
	
	public Apartment() {
		super();
	}
	
	public Apartment(Long id, String alternateId, Address address, String county, Integer value, String condition, Integer units, Integer yearBuilt) {
		super(id, alternateId, address, county, value, condition);
		this.units = units;
		this.yearBuilt = yearBuilt;
	}

	public Integer getUnits() {
		return units;
	}
	public void setUnits(Integer units) {
		this.units = units;
	}
	public Integer getYearBuilt() {
		return yearBuilt;
	}
	public void setYearBuilt(Integer yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
}
