package in.ashokit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Arra {
	
	public Employee employee;

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		int length = arr.length;
		
		System.out.println(5/2);
		
		System.out.println(5.0/2.0);
		
//	System.out.println(arr[length]);
		
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1, 1000));
		empList.add(new Employee(2, 2000));
		empList.add(new Employee(3, 3000));
		empList.add(new Employee(4, 4000));
		empList.add(new Employee(5, 5000));
		
	List<Object> EmpSortedList = 	empList.stream().sorted(new Comparator<Employee>() {
		public int compare(Employee o1, Employee o2) {
			return (int)(o2.getSalary()-o1.getSalary());
		}
	}).skip(2)
			.collect(Collectors.toList());
		
		
		System.out.println(EmpSortedList);
	}

}
