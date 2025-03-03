package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employe implements Comparable<Employe>{
	private int id;
	private String name;
	private int age;
	private String gender;
	private int year;
	public Employe() {
		
	}
	public Employe(int id,String name,int age, String gender, int year) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender=gender;
		this.year=year;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender= gender;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", year=" + year;
	}
	public int compareTo(Employe o) {
		return 0;
	}
}
public class Question{
	public static void main(String args[]) {
		List<Employe> empList = new ArrayList<>();
		empList.add(new Employe(5,"King",33, "m", 2024));
		empList.add(new Employe(2,"anushka",19, "f", 2018));
		empList.add(new Employe(3,"Rohit",35, "m", 2019));
		empList.add(new Employe(2,"Jashwanthi",20, "f", 2017));
		empList.add(new Employe(4,"Rahul",29, "m", 2020));
		empList.add(new Employe(1,"Rinku",21, "f", 2023));
		empList.add(new Employe(2,"Jaiswal",19, "m", 2018));
		System.out.println("before sorting student data");
		empList.forEach(emp ->System.out.println("Id : "+emp.getId()+" Name : "+emp.getName()+" Age : "+emp.getAge()+" Gender :"+ emp.getGender()+"year:" +emp.getYear()));
		List<Employe> frmtData = empList.stream().sorted().collect(Collectors.toList());
		System.out.print(frmtData);
		/*Student std = new Student();
		std.getId();*/
}
	}