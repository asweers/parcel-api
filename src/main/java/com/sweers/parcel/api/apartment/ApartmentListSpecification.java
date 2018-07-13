package com.sweers.parcel.api.apartment;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.sweers.parcel.api.parcel.ParcelListSpecification;

@Component
public class ApartmentListSpecification extends ParcelListSpecification<Apartment> {

	public Specification<Apartment> getFilter(ApartmentListRequest request) {
		return (root, query, cb) -> {
			return super.getFilter(request)
					.and(unitsGreaterThan(request.units_gt))
					.and(unitsLessThan(request.units_lt))
					.and(yearBuiltGreaterThan(request.year_built_gt))
					.and(yearBuiltLessThan(request.year_built_lt))
					.toPredicate(root, query, cb);
		};
	}

	private Specification<Apartment> yearBuiltGreaterThan(Integer yearBuilt) {
		return apartmentAttributeGreaterThan("yearBuilt", yearBuilt);
	}
	
	private Specification<Apartment> yearBuiltLessThan(Integer yearBuilt) {
		return apartmentAttributeLessThan("yearBuilt", yearBuilt);
	}
	
	private Specification<Apartment> unitsGreaterThan(Integer units) {
		return apartmentAttributeGreaterThan("units", units);
	}
	
	private Specification<Apartment> unitsLessThan(Integer units) {
		return apartmentAttributeLessThan("units", units);
	}

	private Specification<Apartment> apartmentAttributeGreaterThan(String attribute, Integer value) {
		return (root, query, cb) -> {
			if(value == null) {
				return null;
			}

			return cb.greaterThan(root.get(attribute), value);
		};
	}
	
	private Specification<Apartment> apartmentAttributeLessThan(String attribute, Integer value) {
		return (root, query, cb) -> {
			if(value == null) {
				return null;
			}

			return cb.lessThan(root.get(attribute), value);
		};
	}
}
