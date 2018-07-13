package com.sweers.parcel.api.apartment;

import com.sweers.parcel.api.parcel.ParcelListRequest;

public class ApartmentListRequest extends ParcelListRequest {
	public Integer units_gt;
	public Integer units_lt;
	public Integer year_built_gt;
	public Integer year_built_lt;
	
	public Integer getUnits_gt() {
		return units_gt;
	}
	public void setUnits_gt(Integer units_gt) {
		this.units_gt = units_gt;
	}
	public Integer getUnits_lt() {
		return units_lt;
	}
	public void setUnits_lt(Integer units_lt) {
		this.units_lt = units_lt;
	}
	public Integer getYear_built_gt() {
		return year_built_gt;
	}
	public void setYear_built_gt(Integer year_built_gt) {
		this.year_built_gt = year_built_gt;
	}
	public Integer getYear_built_lt() {
		return year_built_lt;
	}
	public void setYear_built_lt(Integer year_built_lt) {
		this.year_built_lt = year_built_lt;
	}
}
