package com.mkt.mytest.base.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GetEntityResponse {
	
	List data;
	
	String self;
	
	Links links;
	
	CommonJson info;
	
	public GetEntityResponse() {
		// TODO Auto-generated constructor stub
	}
	public GetEntityResponse(List data, String self, Links links,
			CommonJson info) {
		super();
		this.data = data;
		this.self = self;
		this.links = links;
		this.info = info;
	}

	public CommonJson getInfo() {
		return info;
	}

	public void setInfo(CommonJson info) {
		this.info = info;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	public String getSelf() {
		return self;
	}
	public void setSelf(String self) {
		this.self = self;
	}
	public Links getLinks() {
		return links;
	}
	public void setLinks(Links links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "GetEntityResponse [data=" + data + ", self=" + self
				+ ", links=" + links + ", info=" + info + "]";
	}
	
}
