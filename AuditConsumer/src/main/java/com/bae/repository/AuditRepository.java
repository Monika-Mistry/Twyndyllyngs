package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bae.domain.SentRequest;

@Repository
public interface AuditRepository extends MongoRepository<SentRequest, String> {

}
