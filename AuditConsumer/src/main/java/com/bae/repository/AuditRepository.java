package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bae.domain.SentRequest;

public interface AuditRepository extends MongoRepository<SentRequest, String>{

}
