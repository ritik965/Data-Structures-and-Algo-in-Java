package bipartite;

import java.util.*;

public class BipartiteGraphColoring {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		ArrayList<Integer>graph[]=new ArrayList[v];
		for(int i=0;i<v;i++) {
			graph[i]=new ArrayList<>();
		}
		
		for(int i=0;i<e;i++) {
			int m=sc.nextInt()-1;
			int n=sc.nextInt()-1;
			graph[m].add(n);
			graph[n].add(m);
		}
		
		if(bipar(graph,v)==true) {
			System.out.println("graph is bipartite");
		}else {
			System.out.println("not a bipartite");
		}

	}

	private static boolean bipar(ArrayList<Integer>[] graph, int v) {
		
		int color[]=new int[v];
		Arrays.fill(color, -1);
		
		for(int i=0;i<v;i++) {
			if(color[i]==-1) {
				if(dfs(graph,i,v,color)==false) {
					return false;
				}
			}
		}
		
		return true;
	}

	private static boolean dfs(ArrayList<Integer>[] graph, int i, int v,int color[]) {
		
		if(color[i]==-1) color[i]=1;
		
		for(int m:graph[i]) {
			if(color[m]==-1) {
				
				color[m]=1-color[i];
				if(!dfs(graph,m,v,color)) {
					return false;
				}
			}else if(color[i]==color[m]) {
				return false;
			}
		}
		
		return true;
	}

}
