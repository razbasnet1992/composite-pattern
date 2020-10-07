package com.composite.base;

import com.composite.service.Employee;


//tutorials point composite design pattern example
public class CompositePattern {

	public static void main(String[] args) {
		Employee ceo = new Employee("Raj","CEO",10000);
		
		Employee headSales = new Employee("Salu","headsales",4500);
		
		Employee headMarket = new Employee("Basnet","head Marketing",3500);
		
		Employee clerk2 = new Employee("Sworaj","clerk2",5000);
		Employee clerk1 = new Employee("Sanjay","clerk 1",2500);
		
		Employee exe1 = new Employee("G.K","executive 1",5000);
		Employee exe2 = new Employee("Bahadur","executive 2",5000);
		
		
		ceo.add(headSales);  
		ceo.add(headMarket);
		
		
		headSales.add(exe1);
		headSales.add(exe2);
		
		headMarket.add(clerk1);
		headMarket.add(clerk2);
		//ceo.remove(headMarket);
		
		System.out.println(ceo); //raj
		
		for(Employee e1:ceo.getList()) {//salu,basnet
			System.out.println(e1);
			for(Employee e2:e1.getList()) {//gk,bahadur,
				System.out.println(e2);
			}
		}
		
	}

}
