package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class PriorityQueueT
{
	// Function to find the K'th smallest element in the
	// array using max-heap
	public static int findKthSmallest(List<Integer> A, int k)
	{
		// create an max-heap using PriorityQueue class and
		// insert first k elements of the array into the heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.addAll(A.subList(0, k));

		// do for remaining array elements
		for (int i = k; i < A.size(); i++)
		{
			// if current element is less than the root of the heap
			if (A.get(i) < pq.peek())
			{
				// replace root with the current element
				pq.poll();
				pq.add(A.get(i));
			}
		}

		// return the root of max-heap
		return pq.peek();
	}

	public static void main(String[] args)
	{
		List<Integer> A = Arrays.asList(7, 4, 6, 3, 9, 1);
		int k = 3;

		System.out.println("K'th smallest element in the array is " +
								   findKthSmallest(A, k));
	}
}