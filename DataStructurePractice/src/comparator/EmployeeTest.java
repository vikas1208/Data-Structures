package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(115,"Vikas","Hyderabad"));
		al.add(new Employee(115,"Akash","Bangalore"));
		
		al.add(new Employee(111,"Rakesh","Kolkata"));
		al.add(new Employee(111,"Karthik","Pune"));
		
		System.out.println("Unsorted: ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println();
		Collections.sort(al, new SortRoll().thenComparing(new SortName()));
		
		System.out.println("Sorting by roll no: ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}

}
