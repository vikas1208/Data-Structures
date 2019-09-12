package graphtheory;

import java.util.LinkedList;

public class AdjacencyLinkedList {
	
 	static class Graph{
	
	int V;
	LinkedList<Integer> arr[];
	
	Graph(int V)
	{
		this.V=V;
		arr= new LinkedList[V];
		
		for(int i=0;i<V;i++)
		{
			arr[i]= new LinkedList<>();
		}
	}
	
	}
 	
	public static void addedge(Graph graph, int i, int j) 
	{
		graph.arr[i].add(j);
		graph.arr[j].add(i);	
	}
	public static void print(Graph graph) {
		for(int i=0;i<graph.V;i++)
		{
			System.out.println("Adjacency List of Vertex "+i);
			System.out.print("Head");
			for(int j=0;j<graph.arr[i].size();j++)
			{
				System.out.print("-> "+graph.arr[i].get(j));
			}
			System.out.println("\n");
		}
		
	}

	public static void main(String[] args) {
			int V=5;
			Graph graph = new Graph(V);
			addedge(graph, 0,1);
			addedge(graph, 0,4);
			addedge(graph, 1,2);
			addedge(graph, 1,3);
			addedge(graph, 1,4);
			addedge(graph, 2,3);
			addedge(graph, 2,4);
			print(graph);

	}

	

}
