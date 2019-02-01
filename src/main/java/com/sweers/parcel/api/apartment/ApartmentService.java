package com.sweers.parcel.api.apartment;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ApartmentService {
 
    private final ApartmentRepository apartmentRepository;
    private final ApartmentListSpecification apartmentListSpecification;
 
    public ApartmentService(ApartmentRepository apartmentRepository, ApartmentListSpecification apartmentListSpecification) {
        this.apartmentRepository = apartmentRepository;
        this.apartmentListSpecification = apartmentListSpecification;
    }

    public Apartment save(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }
    
    public Optional<Apartment> findById(long id) {
        return apartmentRepository.findById(id);
    }
    
    public Page<Apartment> findAll(ApartmentListRequest request, Pageable pageable) {
        return apartmentRepository.findAll(apartmentListSpecification.getFilter(request), pageable);
    }

}
