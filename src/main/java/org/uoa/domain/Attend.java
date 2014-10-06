package org.uoa.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Attend {
	private int id;
	private String dutyDay; //the days of which the employee has to work
	private Date punchTime; //the time of which the employee check in
	private boolean isCome;
	private AttendType attendType; // the type of this attend
	private Employee employee; //one attend corresponds to one particular employee only
	private Set<Application> applications=new HashSet<Application>(); //one attend can be found in many applications
	
	public Attend(){}

	public Attend(int id, String dutyDay, Date punchTime, boolean isCome,
			AttendType attendType, Employee employee, Set<Application> applications) {
		super();
		this.id = id;
		this.dutyDay = dutyDay;
		this.punchTime = punchTime;
		this.isCome = isCome;
		this.attendType = attendType;
		this.employee = employee;
		this.applications = applications;
	}
	//setter and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDutyDay() {
		return dutyDay;
	}

	public void setDutyDay(String dutyDay) {
		this.dutyDay = dutyDay;
	}

	public Date getPunchTime() {
		return punchTime;
	}

	public void setPunchTime(Date punchTime) {
		this.punchTime = punchTime;
	}

	public boolean getIsCome() {
		return isCome;
	}

	public void setIsCome(boolean isCome) {
		this.isCome = isCome;
	}

	public AttendType getAttendType() {
		return attendType;
	}

	public void setAttendType(AttendType attendType) {
		this.attendType = attendType;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public Set<Application> getApplications() {
		return applications;
	}

	public void setApplications(Set<Application> applications) {
		this.applications = applications;
	}

	public boolean equals(Object object){
		if(this==object){
			return true;
		}
		if(object!=null && object.getClass()==Attend.class){
			Attend attend=(Attend)object;
			return getDutyDay().equals(attend.getDutyDay()) &&
					getEmployee().equals(attend.getEmployee()) &&
					getIsCome()==attend.getIsCome();
		}
		return false;
	}
	
	public int hashCode(){
		if(getIsCome()){
			return dutyDay.hashCode()+29*employee.hashCode()+1;
		}
		return 29*employee.hashCode();
	}
}
