package sorting.ue.employees;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		Employee[] emp=new Employee[3];
		emp [0]=new Employee(1, "emp1", 2600, "IT");
		emp [1]=new Employee(3, "emp2", 1800, "IT");
		emp [2]=new Employee(2, "emp3", 2400, "IT");
		
		System.out.println("before Sort");
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		Arrays.sort(emp);
		
		System.out.println("after sort");
		for (Employee employee : emp) {
			System.out.println(employee);
		}

	}

}
