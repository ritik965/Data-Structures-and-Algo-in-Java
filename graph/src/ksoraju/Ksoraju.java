package ksoraju;

import java.util.*;

//for strongly connected components

public class Ksoraju {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		ArrayList<Integer>graph[]=new ArrayList[v];
		ArrayList<Integer>graph1[]=new ArrayList[v];
		for(int i=0;i<v;i++) {
			graph[i]=new ArrayList<>();
		}
		for(int i=0;i<v;i++) {
			graph1[i]=new ArrayList<>();
		}
		
		for(int i=1;i<=e;i++) {
			int m=sc.nextInt()-1;//this -1 is due to 0 based indexing in array if i put 1 in graph it
			//will make 0 index in array
			int n=sc.nextInt()-1;
			graph[m].add(n);
			
		}
		
		boolean vis[]=new boolean[v];
		boolean vis1[]=new boolean[v];
		
		//step 1--sort according t their finishing time
		Stack<Integer>st=new Stack<Integer>();
		for(int i=0;i<v;i++) {
			if(vis[i]==false) {
				topo(graph,i,vis,st);
			}
		}
		
		//step 2--transpose graph
		for(int i=0;i<v;i++) {
			for(int i1:graph[i]) {
				graph1[i1].add(i);
			}
		}
		
		//step3--dfs traversal of nodes in stack
		while(!st.isEmpty()) {
			int n=st.pop();
			if(vis1[n]==false) {
				System.out.println("scc--- ");
				rev(n,vis1,graph1);
				System.out.println(" ");
			}
		}
		

	}
	
	private static void rev(int n,boolean vis1[],ArrayList<Integer>graph1[]) {
		vis1[n]=true;
		System.out.print(n+1 +" ");
		for(int i:graph1[n]) {
			if(vis1[i]==false) {
				rev(i,vis1,graph1);
			}
		}
	}

	private static void topo(ArrayList<Integer>[] graph, int src, boolean[] vis, Stack<Integer> st) {
		
		vis[src]=true;
		for(int i:graph[src]) {
			if(vis[i]==false) {
				topo(graph,i,vis,st);
			}
		}
		st.push(src);
		
	}

}
