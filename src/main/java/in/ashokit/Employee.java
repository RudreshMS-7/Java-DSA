package in.ashokit;

public class Employee {
	
	private int Id ;
	
	private double Salary;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public Employee(int id, double salary) {
		super();
		Id = id;
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Salary=" + Salary + "]";
	}
	
	

}
