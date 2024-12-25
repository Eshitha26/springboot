package com.sathya.mvc.model;


	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public class EmployeeModel
	{
		private int eid;
		private String ename;
		private int age;
		private String department;
		private double esalary;
		
		
	}
