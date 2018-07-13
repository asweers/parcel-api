package com.sweers.parcel.api.residential;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ResidentialService {
 
    private final ResidentialRepository residentialRepository;
    private final ResidentialListSpecification residentialListSpecification;
 
    public ResidentialService(ResidentialRepository residentialRepository, ResidentialListSpecification residentialListSpecification) {
        this.residentialRepository = residentialRepository;
        this.residentialListSpecification = residentialListSpecification;
    }

    public Residential save(Residential residential) {
        return residentialRepository.save(residential);
    }
    
    public Page<Residential> findAll(ResidentialListRequest request, Pageable pageable) {
        return residentialRepository.findAll(residentialListSpecification.getFilter(request), pageable);
    }

}

