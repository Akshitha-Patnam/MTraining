package com.test;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Comparator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

public class EmployeeTest {
	List<Employee> emp;
	
	@Before
	public void setUp()
	{	
		emp= new ArrayList<>();
			emp.add(new Employee(3, "Akki", 25, "F"));
			emp.add(new Employee(2, "bunny", 28, "M"));
			emp.add(new Employee(1,"Rohith", 26,"M"));

		System.out.println("executes every test method before execution");
	}
	@Test
	public void testSortById() {
		emp.sort(Comparator.comparingInt(Employee::getId));
		assertEquals(1,emp.get(0).getId());
		assertEquals(2,emp.get(1).getId());
		assertEquals(3,emp.get(2).getId());
		
	}
	@Test
	public void testUserNameIsNull()
	{
		assertThrows(IllegalArgumentException.class, new Executable() {
			@Override
			public void execute() throws Throwable{
				Employee data=new Employee();
				data.setName(null);
			}
		});
	}
	
	@Test
	public void testNameIsNull()
	{
		Throwable exception=assertThrows(IllegalArgumentException.class, ()->{
			Employee obj=new Employee();
			obj.setName(null);
			
		});
		assertEquals("username can't be blank", exception.getMessage());
		
	}
	
	@Test
	public void testNameShortLength()
	{
		Throwable exception=assertThrows(IllegalArgumentException.class, ()->{
			Employee obj=new Employee();
			obj.setName("ro");
			
		});
		assertEquals("name is too short", exception.getMessage());
	}
	
	@Test
	public void testNameLongLength()
	{
		Throwable exception=assertThrows(IllegalArgumentException.class, ()->{
			Employee obj=new Employee();
			obj.setName("hvjgfrysyfxyfrsdykrfyhfrdyrdyrdyhtegdstwstes");
			
		});
		assertEquals("name is too long", exception.getMessage());
		System.out.println(exception.getMessage());
	}
	
	
}
