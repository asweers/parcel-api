package com.sweers.parcel.api.parcel;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class ParcelListSpecification<T> {

	public Specification<T> getFilter(ParcelListRequest request) {
		return (root, query, cb) -> {
			return valueGreaterThan(request.value_gt)
					.and(valueLessThan(request.value_lt))
					.toPredicate(root, query, cb);
		};
	}

	public Specification<T> valueGreaterThan(Integer value) {
		return parcelAttributeGreaterThan("value", value);
	}
	
	private Specification<T> valueLessThan(Integer value) {
		return parcelAttributeLessThan("value", value);
	}

	private Specification<T> parcelAttributeGreaterThan(String attribute, Integer value) {
		return (root, query, cb) -> {
			if(value == null) {
				return null;
			}

			return cb.greaterThan(root.get(attribute), value);
		};
	}
	
	private Specification<T> parcelAttributeLessThan(String attribute, Integer value) {
		return (root, query, cb) -> {
			if(value == null) {
				return null;
			}

			return cb.lessThan(root.get(attribute), value);
		};
	}
}
