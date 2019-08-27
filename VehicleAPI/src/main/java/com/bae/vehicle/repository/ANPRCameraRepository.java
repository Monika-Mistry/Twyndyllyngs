package com.bae.vehicle.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.vehicle.domain.ANPRCamera;

@Repository
public interface ANPRCameraRepository extends CrudRepository<ANPRCamera,Long> {
	
	public List<ANPRCamera> findByAnprPointId(Long anprPointId);

}
