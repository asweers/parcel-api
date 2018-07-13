package com.sweers.parcel.api.parcel;

public class ParcelListRequest {
	public Integer value_gt;
	public Integer value_lt;
	
	public Integer getValue_gt() {
		return value_gt;
	}
	public void setValue_gt(Integer value_gt) {
		this.value_gt = value_gt;
	}
	public Integer getValue_lt() {
		return value_lt;
	}
	public void setValue_lt(Integer value_lt) {
		this.value_lt = value_lt;
	}
}
