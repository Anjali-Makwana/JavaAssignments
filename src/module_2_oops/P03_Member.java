package module_2_oops;

class Member {
	private String name;
	private int age;
	private String phoneNumber;
	private String address;
	private double salary;

	public Member(String name, int age, String phoneNumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}

	public void printSalary() {
		System.out.println("Salary " + salary);
	}
}

class Employee extends Member {
	private String specialization;

	public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
	}
}

class Manager extends Member {
	private String department;

	public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
		super(name, age, phoneNumber, address, salary);
		this.department = department;
	}
}

public class P03_Member {

	public static void main(String[] args) {
		Employee employee = new Employee("Anjali", 25, "5974023423", "Ahmedabad", 50100, "IT");
		Manager manager = new Manager("xyz", 30, "5974023423", "Baroda", 39530, "IT");
		employee.printSalary();
		manager.printSalary();
	}
}
