package org.uoa.domain;

public class Application {
	private int id;
	private String reason;
	private boolean result;
	private Attend attend; // one application can only contain one attend
	private AttendType attendType; // one application can only have one attend type
	private CheckBack checkBack; // one application can only be checkback once
	
	public Application(){}

	public Application(int id, String reason, boolean result, Attend attend, AttendType attendType, CheckBack checkBack) {
		super();
		this.id = id;
		this.reason=reason;
		this.result=result;
		this.attend = attend;
		this.attendType = attendType;
		this.checkBack = checkBack;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Attend getAttend() {
		return attend;
	}

	public void setAttend(Attend attend) {
		this.attend = attend;
	}

	public AttendType getAttendType() {
		return attendType;
	}

	public void setAttendType(AttendType attendType) {
		this.attendType = attendType;
	}

	public CheckBack getCheckBack() {
		return checkBack;
	}

	public void setCheckBack(CheckBack checkBack) {
		this.checkBack = checkBack;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
}
