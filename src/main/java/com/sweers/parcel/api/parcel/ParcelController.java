package com.sweers.parcel.api.parcel;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parcel")
public class ParcelController {

	@Autowired
	private ParcelService parcelService;

	@GetMapping("/{id}")
	public Optional<Parcel> findById(@PathVariable Long id) {
		return parcelService.findById(id);
	}
	
	@GetMapping
	public Page<Parcel> findAll(ParcelListRequest request, Pageable pageable) {
		 return parcelService.findAll(request, pageable);
	}

}
