package bfs;

import java.util.*; 

public class Graph{
		    
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		ArrayList<Integer>adj[]=new ArrayList[m];
		for(int i=0;i<m;i++) {
			adj[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<n;i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			adj[u].add(v);
			adj[v].add(u);
			
		}
		boolean vis[]=new boolean[m+1];
		int src=sc.nextInt();
//		ArrayDeque<Integer>q=new ArrayDeque<>();
//		q.push(src);
//		vis[src]=true;
//		while(!q.isEmpty()) {
//			int node=q.pop();
//			System.out.println(node);
//			for(Integer i:adj[node]) {
//				if(!vis[i]) {
//					vis[i]=true;
//					q.push(i);
//				}
//			}
//		}
		
		dfs(src,vis,adj);
		
		
		
	}

	private static void dfs(int src,boolean vis[],ArrayList<Integer>adj[]) {
		vis[src]=true;
		System.out.println(src);
		for(int i:adj[src]) {
			if(!vis[i]) {
				dfs(i,vis,adj);
			}
		}
		
	}
	
	
	
		    
}

	
	
	       


