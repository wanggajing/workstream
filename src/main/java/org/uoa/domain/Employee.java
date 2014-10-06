package org.uoa.domain;
import java.util.Set;
import java.util.HashSet;


public class Employee {
	private int id;
	private String name;
	private String password;
	private double salary;
	private Manager manager; //one employ has one manager
	private Set<Attend> attends=new HashSet<Attend>(); // one employ has many attends of different day
	private Set<Payment> payments=new HashSet<Payment>(); // one employ has many payments of different months
	
	//here starts the constructors
	public Employee(){}
	
	public Employee(int id,String name,String password,double salary,Manager manager,Set<Attend> attends,Set<Payment> payments){
		this.id=id;
		this.name=name;
		this.password=password;
		this.salary=salary;
		this.manager=manager;
		this.attends=attends;
		this.payments=payments;
	}
	//here starts the setter and getter 
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public Set<Attend> getAttends() {
		return attends;
	}
	public void setAttends(Set<Attend> attends) {
		this.attends = attends;
	}
	public Set<Payment> getPayments() {
		return payments;
	}
	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}
	//override equal method
	public boolean equals(Object object){
		if(this==object){
			return true;
		}
		if(object!=null && object.getClass()==Employee.class){
			Employee employee=(Employee)object;
			return this.getName().equals(employee.getName()) && this.getPassword().equals(employee.getPassword());
		}
		return false;
	}
	//override hashCode method
	public int hashCode(){
		return name.hashCode()+password.hashCode()*17;
	}
}
