package comparator;

import java.util.Comparator;

public class Employee 
{
	int empid;
	String name;
	String location;
	
	public Employee(int empid, String name, String location)
	{
		this.empid=empid;
		this.name= name;
		this.location=location;
	}
	
	public String toString()
	{
		return this.empid+" "+this.name+" "+this.location;
	}
}
	class SortRoll implements Comparator<Employee>
	{
		public int compare(Employee e1, Employee e2)
		{
			return e1.empid-e2.empid;
		}
	}
	
	class SortName implements Comparator<Employee>
	{
		public int compare(Employee e1, Employee e2)
		{
			return e1.name.compareTo(e2.name);
		}
	}
	

