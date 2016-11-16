package com.mkt.mytest.base.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AppError {
	
	private int code;
    private String field;
    private String  title;
    private String detail;
    private	String action;
	private	String messages;
	private	String suggestion;
	
	public AppError() {
	}
	
	public AppError(int code,String field, String title, String detail) {
		super();
		this.field = field;
		this.title = title;
		this.detail = detail;
		this.code=code;
	}

	public AppError(String action, String messages, String suggestion) {
		super();
		this.action = action;
		this.messages = messages;
		this.suggestion = suggestion;
	}
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	@Override
	public String toString() {
		return "AppError [code=" + code + ", field=" + field + ", title="
				+ title + ", detail=" + detail + ", action=" + action
				+ ", messages=" + messages + ", suggestion=" + suggestion + "]";
	}
}
