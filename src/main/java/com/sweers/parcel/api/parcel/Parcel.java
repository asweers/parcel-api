package com.sweers.parcel.api.parcel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import com.sweers.parcel.api.address.Address;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Parcel {
	
	@Id
	private Long id;
	private String alternateId;
	@ManyToOne(cascade = {CascadeType.ALL})
	private Address address;
	private String county;
	private Integer value;
	private String condition;

	public Parcel() {}
	
	public Parcel(Long id, String alternateId, Address address, String county, Integer value, String condition) {
		super();
		this.id = id;
		this.alternateId = alternateId;
		this.address = address;
		this.county = county;
		this.value = value;
		this.condition = condition;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAlternateId() {
		return alternateId;
	}
	public void setAlternateId(String alternateId) {
		this.alternateId = alternateId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
}
