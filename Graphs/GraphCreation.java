package Graphs;

import java.util.*;
public class GraphCreation {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Generics array creation is not allowed in JAVA
//		Vector<Integer> adjList[] = new Vector<Integer>[5];
		
		System.out.println("Enter no. of vertices : ");
		int V = scan.nextInt();
		
		//Adjacency List Representation : ArrayList can also be used in place of vector
		Vector<Vector<Integer>> adjList = new Vector<Vector<Integer>>(V);
		for(int i=0;i<V;i++) {adjList.add(new Vector<Integer>());}
			
		String flag = "Y";
		while(!flag.equals("n") && !flag.equals("N")) {
			int u = -1;
			 do{
				System.out.print("From Vertex : ");
				u = scan.nextInt();
			}while(u>=V);
			
			int v = -1;
			do {
				System.out.print("To Vertex : ");
				v = scan.nextInt();
			}while(v>=V);
			
			if(u != -1 && v!= -1)
				addEdgeUndirected(adjList,u,v);
		System.out.print("Want to add more edges : (Y/N) : ");
		flag = scan.next();
		}
		printGraph(adjList,V);
		
	}
	//For Undirected Graph
	public static void addEdgeUndirected(Vector<Vector<Integer>> adjList,int from,int to) {
		adjList.get(from).add(to);
		adjList.get(to).add(from);
	}
	//For Directed Graph
	public static void addEdgeDirected(Vector<Vector<Integer>> adjList,int from,int to) {
		adjList.get(from).add(to);
	}
	//print graph
	public static void printGraph(Vector<Vector<Integer>> adjList,int V) {
		for(int i=0;i<V;i++) {
			
			for(int j = 0;j<adjList.get(i).size();j++) {
				System.out.println(i+ " -> "+adjList.get(i).get(j));
			}
			
		}
	}
}
