package com.mkt.mytest.base.json;

public class Links {
	
	String self;
	String first;
	String prev;
	String next;
	String last;
	
	public Links() {
	}
	public Links(String self, String first, String prev, String next,
			String last) {
		super();
		this.self = self;
		this.first = first;
		this.prev = prev;
		this.next = next;
		this.last = last;
	}
	public String getSelf() {
		return self;
	}
	public void setSelf(String self) {
		this.self = self;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getPrev() {
		return prev;
	}
	public void setPrev(String prev) {
		this.prev = prev;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	
	@Override
	public String toString() {
		return "Links [self=" + self + ", first=" + first + ", prev=" + prev
				+ ", next=" + next + ", last=" + last + "]";
	}
	
	
}
