package com.telstra.springbootdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.telstra.springbootdemo.model.Employee;
@SuppressWarnings("unused")
public class EmployeeTest {
	
	@Test
	public void getSalary() {
		
		Employee employee = new Employee (1001,"Ram","Manager", 50000);
		assertEquals(50000,employee.getSalary());
		
	}
		@Test
		public void getNameTest() {
			Employee employee = new Employee (1001,"Ram","Manager", 50000);
			assertEquals("Ram",employee.getName());
		}
		
	

}
