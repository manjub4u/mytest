package com.mkt.mytest.base.exception;

public class AppCustomException extends RuntimeException{
	
	private	String action;
	private	String message;
	private	String suggestion;
	
	public AppCustomException() {
		super();
	}
	
	public AppCustomException(String message) {
		super(message);
		this.message=message;
	}
	
	public AppCustomException(String action, String message, String suggestion) {
		super(message);
		this.action = action;
		this.message = message;
		this.suggestion = suggestion;
	}

	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
}
