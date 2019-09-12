package comparator;


//Java program to demonstrate working of Comparator 
//interface 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

//A class to represent a student. 
public class Student 
{ 
 int rollno; 
 String name, address; 

 // Constructor 
 public Student(int rollno, String name, 
                            String address) 
 { 
     this.rollno = rollno; 
     this.name = name; 
     this.address = address; 
 } 

 // Used to print student details in main() 
 public String toString() 
 { 
     return this.rollno + " " + this.name + 
                        " " + this.address; 
 } 
} 

class Sortbyroll implements Comparator<Student> 
{ 
 // Used for sorting in ascending order of 
 // roll number 
 public int compare(Student a, Student b) 
 { 
		/*
		 * if(a.rollno<b.rollno) return 1; else return -1;
		 */
     return a.rollno - b.rollno; 
		/*
		 * if(a.rollno > b.rollno) return 1; else if (a.rollno < b.rollno) return -1;
		 * else { return a.name.compareTo(b.name); }
		 */
	 
 } 
} 

class Sortbyname implements Comparator<Student> 
{ 
 // Used for sorting in ascending order of 
 // roll name 
 public int compare(Student a, Student b) 
 { 
     return a.name.compareTo(b.name); 
 } 
} 

//Driver class 
/*
 * class Main { public static void main (String[] args) { ArrayList<Student> ar
 * = new ArrayList<Student>(); ar.add(new Student(111, "bbbb", "london"));
 * ar.add(new Student(131, "aaaa", "nyc")); ar.add(new Student(121, "cccc",
 * "jaipur"));
 * 
 * System.out.println("Unsorted"); for (int i=0; i<ar.size(); i++)
 * System.out.println(ar.get(i));
 * 
 * Collections.sort(ar, new Sortbyroll());
 * 
 * System.out.println("\nSorted by rollno"); for (int i=0; i<ar.size(); i++)
 * System.out.println(ar.get(i));
 * 
 * Collections.sort(ar, new Sortbyname());
 * 
 * System.out.println("\nSorted by name"); for (int i=0; i<ar.size(); i++)
 * System.out.println(ar.get(i)); } }
 */