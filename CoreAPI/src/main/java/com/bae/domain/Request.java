package com.bae.domain;

import java.sql.Timestamp;

public class Request {

	private String username;

	private String searchItem;

	private Timestamp timestamp;

	public Request() {

	}

	public Request(String username, String searchItem, Timestamp timestamp) {
		this.username = username;
		this.searchItem = searchItem;
		this.timestamp = timestamp;
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
