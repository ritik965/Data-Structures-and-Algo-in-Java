package bipartite;

import java.util.*;

public class Bipartite {
	
	
	static class Pair{
		int v;
		int level;
		Pair(int v,int level){
			this.level=v;
			this.level=level;
		}
	}

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
			graph[n].add(m);
		}
		int vis[]=new int[v];
		Arrays.fill(vis, -1);
		for(int i=0;i<v;i++) {
			if(vis[i]==-1) {
				boolean path=check(graph,vis,i);
				if(path==false) {
					System.out.println(false);
					return;
				}
			}
		}
		System.out.println(true);

	}

	private static boolean check(ArrayList<Integer>[] graph, int[] vis, int i) {
		
		ArrayDeque<Pair>dq=new ArrayDeque<>();
		dq.add(new Pair(i,0));
		while(!dq.isEmpty()) {
			Pair m=dq.pop();
			if(vis[m.v]!=-1) {
				if(m.level!=vis[m.v]) {
					return false;
				}
				
			}else {
				vis[m.v]=m.level;
			}
			
			
			for(int j:graph[m.v]) {
				if(vis[j]==-1) {
					dq.add(new Pair(j,m.level+1));
				}
			}
		}
		return true;
	}

}
