package graphBasic;

import java.util.ArrayList;

public class Basic {
	public static void main(String[] args) {
		int n=5;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		addEdge(adj,0,1);
		addEdge(adj,0,4);
		addEdge(adj,1,2);
		addEdge(adj,1,3);
		addEdge(adj,1,4);
		addEdge(adj,2,3);
		addEdge(adj,3,4);
		//print
		printgraph(adj);
		

	}

	private static void printgraph(ArrayList<ArrayList<Integer>> adj) {
		for(int i=0;i<adj.size();i++) {
			System.out.println("adjacency matrix"+i);
			System.out.println("head");
			for(int j=0;j<adj.get(i).size();j++) {
				System.out.println("head ->"+adj.get(i).get(j));
			}
			System.out.println();
		}
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
		
		adj.get(i).add(j);
		adj.get(j).add(i);
	}

}
