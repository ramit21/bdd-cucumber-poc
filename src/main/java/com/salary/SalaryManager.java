package com.salary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalaryManager {
	
	private Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
	 
	public SalaryManager(final List<Employee> employees) {
		for(Employee emp : employees){
			this.employeeMap.put(emp.getId(), emp);
		}
	}
 
	/**
	 * Logic to be written after writing Cucumber test case first, and see them fail.
	 */
	public void increaseSalary(final Integer id, final int increaseInPercent) {
		Employee nominee = this.employeeMap.get(id);
		float oldSalary = nominee.getSalary();
		nominee.setSalary(oldSalary + oldSalary * increaseInPercent / 100);
	}
 
	public Employee getPayroll(final int id) {
		return this.employeeMap.get(id);
	}

}
