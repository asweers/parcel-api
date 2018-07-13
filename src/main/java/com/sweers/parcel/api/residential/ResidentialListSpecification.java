package com.sweers.parcel.api.residential;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.sweers.parcel.api.parcel.ParcelListSpecification;

@Component
public class ResidentialListSpecification extends ParcelListSpecification<Residential>{

	public Specification<Residential> getFilter(ResidentialListRequest request) {
		return (root, query, cb) -> {
			return super.getFilter(request)
					.and(yearBuiltGreaterThan(request.year_built_gt))
					.and(yearBuiltLessThan(request.year_built_lt))
					.toPredicate(root, query, cb);
		};
	}

	private Specification<Residential> yearBuiltGreaterThan(Integer yearBuilt) {
		return residentialAttributeGreaterThan("yearBuilt", yearBuilt);
	}
	
	private Specification<Residential> yearBuiltLessThan(Integer yearBuilt) {
		return apartmentAttributeLessThan("yearBuilt", yearBuilt);
	}

	private Specification<Residential> residentialAttributeGreaterThan(String attribute, Integer value) {
		return (root, query, cb) -> {
			if(value == null) {
				return null;
			}

			return cb.greaterThan(root.get(attribute), value);
		};
	}
	
	private Specification<Residential> apartmentAttributeLessThan(String attribute, Integer value) {
		return (root, query, cb) -> {
			if(value == null) {
				return null;
			}

			return cb.lessThan(root.get(attribute), value);
		};
	}
}
