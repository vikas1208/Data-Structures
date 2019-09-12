package practice;
//SumOfPrimesInGivenRange
//Java program to find sum of primes 
//in range L to R 

import java.util.*; 
import java.lang.*; 
import java.io.*; 

class SumOfPrimesInGivenRange{ 

		static final int MAX = 100; 

		//prefix[i] is going to store sum of primes 
		//till i (including i). 
			static int prefix[]=new int[MAX + 1]; 

			//Function to build the prefix sum array 
			static void buildPrefix() 
			{ 
				// Create a boolean array "prime[0..n]". A 
				// value in prime[i] will finally be false 
				// if i is Not a prime, else true. 
				boolean prime[] = new boolean[MAX + 1]; 
   
				for(int i = 0; i < MAX+1; i++) 
					prime[i] = true; 

				for (int p = 2; p * p <= MAX; p++) { 

					// If prime[p] is not changed, then 
					// it is a prime 
					if (prime[p] == true) { 

						// Update all multiples of p 
						for (int i = p * 2; i <= MAX; i += p) 
							prime[i] = false; 
					} 
				} 

					// Build prefix array 
				prefix[0] = prefix[1] = 0; 
				for (int p = 2; p <= MAX; p++) { 
						prefix[p] = prefix[p - 1]; 
						if (prime[p] == true) 
							prefix[p] += p; 
				} 
} 

//Function to return sum of prime in range 
		static int sumPrimeRange(int L, int R) 
			{ 
				buildPrefix(); 

 			return prefix[R] - prefix[L - 1]; 
			} 
		
//Driver code 
		public static void main(String args[]) 
		{ 
			int L = 10, R = 20; 

			System.out.println (sumPrimeRange(L, R)); 

		} 
		} 
