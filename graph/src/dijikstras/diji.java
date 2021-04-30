package dijikstras;

public class diji {

	public static void main(String[] args) {
		int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
								        { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
								        { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
								        { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
								        { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
								        { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
								        { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
								        { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
								        { 0, 0, 2, 0, 0, 0, 6, 7, 0 } }; 
			Dijikstras(graph,0);
								       
	}
	public static void Dijikstras(int[][] graph,int src) {
		int v=graph.length;
		int dis[]=new int[v];
		boolean vis[]=new boolean[v];
		for(int i=1;i<v;i++) {
			dis[i]=Integer.MAX_VALUE;	
		}
		dis[src]=0;
		for(int i=0;i<v-1;i++) {
			int u=findMin(dis,vis);	
			vis[u]=true;
			//neighbour
			for(int j=0;j<v;j++) {
			     if(graph[u][j]!=0 && !vis[j] && dis[u]!=Integer.MAX_VALUE) {
	                  	int distance=dis[u]+graph[u][j];
	                  	if(distance<dis[j]) {
	                       dis[j]=distance;   		
	                  	}
			     }
			     
			}
			
		}
		for(int i=0;i<v;i++) {
			System.out.println(i+" "+dis[i]);
		}
		
	}
	public static int findMin(int[] dis,boolean[] vis) {
	    int u=-1;
	    for(int i=0;i<dis.length;i++) {
	    	if(!vis[i] &&(u==-1||dis[i]<dis[u])){
	           u=i;    		
	    	}
	    }
		return u;
	}

}
