package com.sweers.parcel.api.apartment;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apartment")
public class ApartmentController {

	@Autowired
	private ApartmentService apartmentService;
	
	@PostMapping
	public Apartment save(@Valid @RequestBody Apartment apartment) {
	    return apartmentService.save(apartment);
	}
	
	@GetMapping("/{id}")
	public Optional<Apartment> findById(@PathVariable Long id) {
		return apartmentService.findById(id);
	}
	
	@GetMapping
	public Page<Apartment> findAll(ApartmentListRequest request, Pageable pageable) {
		 return apartmentService.findAll(request, pageable);
	}

}