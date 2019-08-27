package com.bae.mobile.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.mobile.domain.CellTower;

@Repository
public interface CellTowerRepository extends CrudRepository<CellTower, Long> {

}
