package com.bae.domain;

import java.sql.Timestamp;

public class SentRequest {

	private String id;

	private String username;

	private String searchItem;

	private Timestamp timestamp;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public SentRequest() {
	}

	public SentRequest(SentRequest request) {
		super();
		this.id = request.getId();
		this.username = request.getUsername();
		this.searchItem = request.getSearchItem();
		this.timestamp = request.getTimestamp();
	}
}
