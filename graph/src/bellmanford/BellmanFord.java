package bellmanford;
import java.util.*;
public class BellmanFord {
	
	 static class Edge{
		
		int src;
		int des;
		int wt;
		Edge(int src,int des,int wt){
			this.src=src;
			this.des=des;
			this.wt=wt;
		}
			
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int v1=sc.nextInt();
		int e=sc.nextInt();
		Edge edge[]=new Edge[e];
		
		for(int i=0;i<e;i++) {
			int u=sc.nextInt()-1;
			int v=sc.nextInt()-1;
			int w=sc.nextInt()-1;
			edge[i]=new Edge(u,v,w);
		}
		
		int dis[]=new int[v1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		dis[0]=0;
		
		for(int i=1;i<=v1-1;i++) {
			for(int j=0;j<e;j++) {
				int u=edge[j].src;
				int v=edge[j].des;
				int w=edge[j].wt;
				if(dis[u]!=Integer.MAX_VALUE && dis[u]+w<dis[v]) {
					dis[v]=dis[u]+w;
				}
			}
		}
		
		//for negative weight cycle detection
		for (int j = 0; j < e; ++j) { 
            int u = edge[j].src; 
            int v = edge[j].des; 
            int w = edge[j].wt; 
            if (dis[u] != Integer.MAX_VALUE && dis[u] + w < dis[v]) { 
                System.out.println("Graph contains negative weight cycle"); 
            }  
        } 
		
		for(int i=0;i<v1;i++) {
			System.out.println(i +" "+dis[i]);
		}
		
		
	}

}
