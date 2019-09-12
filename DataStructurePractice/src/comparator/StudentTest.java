package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

	 public static void main (String[] args) 
	 { 
	     ArrayList<Student> ar = new ArrayList<Student>(); 
	     ar.add(new Student(111, "zzzz", "london")); 
	     ar.add(new Student(131, "pppp", "nyc")); 
	     ar.add(new Student(111, "cccc", "jaipur")); 
	     ar.add(new Student(141, "cccc", "jaipur")); 
	     ar.add(new Student(131, "aaaa", "jaipur")); 

	     System.out.println("Unsorted"); 
	     for (int i=0; i<ar.size(); i++) 
	         System.out.println(ar.get(i)); 

	  //   Collections.sort(ar, new Sortbyroll()); 
	     Collections.sort(ar, new Sortbyroll().thenComparing(new Sortbyname()));

	     System.out.println("\nSorted by rollno and then name"); 
	     for (int i=0; i<ar.size(); i++) 
	         System.out.println(ar.get(i)); 

	     Collections.sort(ar, new Sortbyname()); 

	     System.out.println("\nSorted by name"); 
	     for (int i=0; i<ar.size(); i++) 
	         System.out.println(ar.get(i)); 
	 } 
}
