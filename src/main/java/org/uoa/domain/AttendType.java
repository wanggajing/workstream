package org.uoa.domain;

import java.util.HashSet;
import java.util.Set;

public class AttendType {
	private int id;
	private String name;
	private double amerce;
	private Set<Attend> attends=new HashSet<Attend>(); // one attend type can be shared with many attend
	private Set<Application> applications=new HashSet<Application>(); // one attend type can be found in different applications
	
	public AttendType(){}

	public AttendType(int id, String name, double amerce, Set<Attend> attends,
			Set<Application> applications) {
		super();
		this.id = id;
		this.name = name;
		this.amerce = amerce;
		this.attends = attends;
		this.applications = applications;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmerce() {
		return amerce;
	}

	public void setAmerce(double amerce) {
		this.amerce = amerce;
	}

	public Set<Attend> getAttends() {
		return attends;
	}

	public void setAttends(Set<Attend> attends) {
		this.attends = attends;
	}

	public Set<Application> getApplications() {
		return applications;
	}

	public void setApplications(Set<Application> applications) {
		this.applications = applications;
	}
	
	
}
