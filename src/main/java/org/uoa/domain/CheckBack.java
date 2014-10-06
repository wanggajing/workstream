package org.uoa.domain;

public class CheckBack {
	private int id;
	private String reason;
	private boolean result;
	private Manager manager;
	private Application application; // one checkback contains only one applications
	
	public CheckBack(){}

	public CheckBack(int id, String reason, boolean result, Manager manager, Application application) {
		super();
		this.id = id;
		this.reason=reason;
		this.result=result;
		this.manager = manager;
		this.application = application;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
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
