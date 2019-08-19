package com.bae.domain;

import java.sql.Timestamp;

public class SentRequest {
	
private String username;
	
	private String searchItem;
	
	private Timestamp timestamp;
	
	public SentRequest() {
		
	}
	
	public SentRequest(Request request) {
		this.username = request.getUsername();
		this.searchItem = request.getSearchItem();
		this.timestamp = request.getTimestamp();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSearchItem() {
		return searchItem;
	}

	public void setSearchItem(String searchItem) {
		this.searchItem = searchItem;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	

}
