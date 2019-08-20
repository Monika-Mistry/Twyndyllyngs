package com.bae.service;

import com.bae.domain.SentRequest;

public interface AuditListener {

	public void receiveMessage(SentRequest sentRequest);
}
