package graphtheory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal {
	int V;
	
	LinkedList<Integer> adj[];
	Queue<Integer> queue = new LinkedList<Integer>();
	public  BreadthFirstTraversal(int V)
	{
		this.V=V;
		adj= new LinkedList[V];
		for(int i=0;i<V ;i++)
		{
			adj[i]= new LinkedList();
		}
	}
	public void addedge(int i, int j) 
	{
		adj[i].add(j);
	}
	
	public void BFTraversal(int i, boolean[] visited) 
	{
		queue.add(i);
		visited[i]=true;
		int k;
		while(!queue.isEmpty())
		{
			k=queue.remove();
			System.out.println(k+" ");
			Iterator<Integer> it=adj[k].listIterator();
			int j;
			while(it.hasNext())
			{
				j=it.next();
				if(visited[j]!=true)
				{
					queue.add(j);
					visited[j]=true;
				}
			}
		}
	}
	
	public void BFsearch(int i) {
		boolean visited[]=new boolean[V];
		BFTraversal(i,visited);
		
	}


	public static void main(String[] args) {
		int V=5;
		BreadthFirstTraversal graph = new BreadthFirstTraversal(V);
		graph.addedge(0,1);
		graph.addedge(0,2);
		graph.addedge(1,2);
		graph.addedge(2,0);
		graph.addedge(2,3);
		graph.addedge(3,3);
		graph.BFsearch(0);
	}

}
