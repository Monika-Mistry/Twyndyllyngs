package com.bae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.bae.domain.SentRequest;
import com.bae.repository.AuditRepository;

@Component
public class AuditListenerImpl {

	private AuditRepository repository;

	public AuditListenerImpl(@Autowired AuditRepository repository) {
		this.repository = repository;
	}

	@JmsListener(destination = "AuditQueue", containerFactory = "jmsFactory")
	public void receiveMessage(SentRequest sentRequest) {
		System.out.println("Received <" + sentRequest + ">");
		repository.save(sentRequest);
		System.out.println(sentRequest + " processed ...");
	}

}
