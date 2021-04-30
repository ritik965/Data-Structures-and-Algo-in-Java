package topologica;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Topo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		ArrayList<Integer>graph[]=new ArrayList[v];
		for(int i=0;i<v;i++) {
			graph[i]=new ArrayList<>();
		}
		
		for(int i=0;i<e;i++) {
			int m=sc.nextInt();
			int n=sc.nextInt();
			graph[m].add(n);
			
		}

		
		boolean vis[]=new boolean[v];
		Stack<Integer>st=new Stack<Integer>();
		for(int i=0;i<v;i++) {
			if(vis[i]==false) {
				topo(graph,i,vis,st);
			}
		}
		while (st.empty() == false) 
            System.out.print(st.pop() + " "); 

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
