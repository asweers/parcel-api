package com.sweers.parcel.api.parcel;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ParcelService {
 
    private final ParcelRepository parcelRepository;
    private final ParcelListSpecification<Parcel> parcelListSpecification;
 
    public ParcelService(ParcelRepository parcelRepository, ParcelListSpecification<Parcel> parcelListSpecification) {
        this.parcelRepository = parcelRepository;
        this.parcelListSpecification = parcelListSpecification;
    }

    public Parcel save(Parcel parcel) {
        return parcelRepository.save(parcel);
    }
    
    public Optional<Parcel> findById(long id) {
        return parcelRepository.findById(id);
    }
    
    public Page<Parcel> findAll(ParcelListRequest request, Pageable pageable) {
        return parcelRepository.findAll(parcelListSpecification.getFilter(request), pageable);
    }

}
