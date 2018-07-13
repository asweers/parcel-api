package com.sweers.parcel.api.residential;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/residential")
public class ResidentialController {

	@Autowired
	private ResidentialService residentialService;
	
	@PostMapping
	public Residential save(@Valid @RequestBody Residential residential) {
	    return residentialService.save(residential);
	}
	
	@GetMapping
	public Page<Residential> findAll(ResidentialListRequest request, Pageable pageable) {
		 return residentialService.findAll(request, pageable);
	}
}