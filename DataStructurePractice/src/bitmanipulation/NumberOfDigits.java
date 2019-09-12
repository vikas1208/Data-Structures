package bitmanipulation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberOfDigits {

	public static void main(String[] args) {
		 int x=124001;
		 System.out.println(Math.floor(Math.log10(x))+1);
		boolean a= BigInteger.valueOf(11).isProbablePrime(1);
		System.out.println(a);
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(2);
		li.add(2);
		li.add(5);
		Collections.rotate(li, 2);
System.out.println(li);
int freq=Collections.frequency(li, 2);
System.out.println(freq);

int arr[] = {1,2,5,6,7};
int b=Collections.binarySearch(li, 3);
System.out.println(b);

int x1=100;
System.out.println(Integer.toString(x1, 8));




	}
	

}
