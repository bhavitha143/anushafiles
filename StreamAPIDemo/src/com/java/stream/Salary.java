package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class  Salary {
	
		  final static double INCREMENT_SALARY = 10000;
		  public static void main(String[] args) {
		        
		    List<Employee> employeeslist = new ArrayList<>();
		    employeeslist.add(new Employee(1, "anu", 90000));
		       
		    
		    
		    List<Employee> newEployees = employeeslist.stream().map(e -> 
		    {
		       e.setSal(e.getSal()*3/2);
		         return e;
		     }).collect(Collectors.toList());
		    
		    System.out.println(newEployees);
		  }
		}



class  Employee{
	
	
	private int id;
	private String name;
	private double sal;
	
	
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
}