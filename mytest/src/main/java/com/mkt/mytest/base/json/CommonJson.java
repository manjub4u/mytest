package com.mkt.mytest.base.json;

public class CommonJson {

	int id;

	String message;

	String detail;

	public CommonJson() {
		// TODO Auto-generated constructor stub
	}

	public CommonJson(int id, String message, String detail) {
		super();
		this.message = message;
		this.detail = detail;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
