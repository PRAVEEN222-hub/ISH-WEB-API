package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.CitizenEntity;

public interface ICitizenRepo extends JpaRepository<CitizenEntity, Integer> {

}
