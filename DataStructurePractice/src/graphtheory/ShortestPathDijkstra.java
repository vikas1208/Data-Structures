package graphtheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class ShortestPathDijkstra {
	   class Pair
	{
		int position;
		int weight;
		
		Pair(int v,int w)
		{
			this.position=v;
			this.weight=w;
		}
	}
	   
	/*
	 * class PriorityPair { int distance; int position;
	 * 
	 * PriorityPair(int distance,int position) { this.distance=distance;
	 * this.position=position; } }
	 */
	
	public static void addedge(ArrayList<ArrayList<Pair>> ad, int startpos, int endpos, int weight,ShortestPathDijkstra a) {
		for(int i=0;i<ad.size();i++)
		{
			ad.get(startpos).add(a.new Pair(endpos,weight));
			ad.get(endpos).add(a.new Pair(startpos,weight));
		}	
	}
	
	public static void dijkstra(ArrayList<ArrayList<Pair>> ad, int actualstart, ShortestPathDijkstra a) {
		int distance[]=new int[ad.size()+1];
		for(int i=1;i<ad.size();i++)
		{
			distance[i]=Integer.MAX_VALUE;	
		}
		distance[actualstart]=0;
		
		PriorityQueue<Pair> mh= new PriorityQueue<Pair>();
		mh.add(a.new Pair(distance[actualstart],actualstart));
		while(!mh.isEmpty())
		{
			Pair p=mh.poll();
					int dis=p.weight;
					int u=p.position;
				//	for(Pair q:ad[u])
					{
					
					}
		}
		
	}

	public static void main(String[] args) throws IOException {
		ShortestPathDijkstra a= new ShortestPathDijkstra();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc=br.readLine();
		String str1[]=br.readLine().split(" ");
		int node=Integer.parseInt(str1[0]);
		int edges=Integer.parseInt(str1[1]);
		ArrayList<ArrayList<Pair>> ad= new ArrayList<ArrayList<Pair>>(node);
		for(int i=0;i<ad.size();i++)
		{
			ad.add(new ArrayList<Pair>());
		}
		for(int i=0;i<edges;i++)
		{
			String str2[]=br.readLine().split(" ");
			int startpos=Integer.parseInt(str2[0]);
			int endpos=Integer.parseInt(str2[1]);
			int weight=Integer.parseInt(str2[2]);
			addedge(ad,startpos,endpos,weight,a);
		}
		String str3=br.readLine();
		int actualstart=Integer.parseInt(str3);
		dijkstra(ad,actualstart,a);

	}





}
