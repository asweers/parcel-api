package com.sweers.parcel.api.residential;

import com.sweers.parcel.api.parcel.ParcelListRequest;

public class ResidentialListRequest extends ParcelListRequest {
	public Integer year_built_gt;
	public Integer year_built_lt;
	
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
