package org.emp;

public class Employee {
	private void empId() {
		System.out.println("12345");
	}
	private void empName() {
		System.out.println("Ruby");
	
	}
	private void empDob() {
		System.out.println("29/10/2000");
	}
	private void empPhone() {
		System.out.println("9688922338");
	}
	private void empEmail() {
		System.out.println("caroline@gmail.com");
	}
	private void empAddress() {
		System.out.println("Shanmuga Nagar,Trichy");
	}
	public static void main(String[] args) {
		Employee employee_details = new Employee();
		employee_details.empId();
		employee_details.empName();
		employee_details.empDob();
		employee_details.empPhone();
		employee_details.empEmail();
		employee_details.empAddress();
	}
}
