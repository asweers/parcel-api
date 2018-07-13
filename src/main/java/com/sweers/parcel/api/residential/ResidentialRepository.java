package com.sweers.parcel.api.residential;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidentialRepository extends JpaRepository<Residential, Long>, JpaSpecificationExecutor<Residential> {

}
