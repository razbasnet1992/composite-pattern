package com.composite.service;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private int salary;
	private String position;
	private List<Employee> list =new ArrayList<Employee>();
	
   public Employee(String name,String position,int salary) {
	   this.name = name;
	   this.salary = salary;
	   this.position = position;
	  // list = new ArrayList<Employee>();
	   //System.out.println(list);
   }
   public void add(Employee e) {
	   list.add(e);
   }
   public void remove(Employee e) {
	   list.remove(e);
   }
   public List<Employee> getList(){
	   return list;
   }
   @Override
   public String toString() {
	   return "Employee :[Name :"+name+",salary :"+salary+", position :"+position+"]";
   }

}
