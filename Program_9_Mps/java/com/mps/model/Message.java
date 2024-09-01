package com.mps.model;

public class Message {

	private int mid;
	private String from;
	private String to;
	private String msg;
	private int uid;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "Message [mid=" + mid + ", from=" + from + ", to=" + to + ", msg=" + msg + ", uid=" + uid + "]";
	}

}
