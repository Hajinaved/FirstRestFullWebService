package com.haji.Restfulwebservice.Exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	private LocalDateTime dt;
	private String message;
	private String description;

	public ErrorDetails() {
		// TODO Auto-generated constructor stub
	}

	ErrorDetails(LocalDateTime dt, String message, String description) {
		super();
		this.dt = dt;
		this.message = message;
		this.description = description;
	}

	public LocalDateTime getDt() {
		return dt;
	}

	public void setDt(LocalDateTime dt) {
		this.dt = dt;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
