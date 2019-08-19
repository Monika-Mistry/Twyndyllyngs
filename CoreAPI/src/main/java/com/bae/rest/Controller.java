package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import com.bae.domain.Request;
import com.bae.domain.SentRequest;

public abstract class Controller {
	
	private JmsTemplate jmsTemplate;
	
	public Controller(@Autowired JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void sendToQueue(Request request) {
		SentRequest sentRequest = new SentRequest(request);	
		jmsTemplate.convertAndSend("AuditQueue", sentRequest);
	}
}
