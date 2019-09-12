package graphtheory;

import java.util.ArrayList;

public class AdjacencyListArrayList {
	
	public static void addedge(ArrayList<ArrayList<Integer>> adj, int i, int j) 
	{
		adj.get(i).add(j);
		adj.get(j).add(i);	
	}
	
	public static void print(ArrayList<ArrayList<Integer>> adj) {
		for(int i=0;i<adj.size();i++)
		{
			System.out.println("Adjacency List of "+i);
			for(int j=0;j<adj.get(i).size();j++)
			{
				System.out.print(adj.get(i).get(j)+" ");
			}
			System.out.println("\n");
		}
		
	}

	public static void main(String[] args) {
		int V=5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
		for(int i=0;i<V;i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		addedge(adj, 0,1);
		addedge(adj, 0,4);
		addedge(adj, 1,2);
		addedge(adj, 1,3);
		addedge(adj, 1,4);
		addedge(adj, 2,3);
		addedge(adj, 3,4);
		print(adj);
	}

	

	

}
