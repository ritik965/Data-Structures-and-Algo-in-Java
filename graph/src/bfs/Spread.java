package bfs;
import java.util.*;
public class Spread {

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
		int src=sc.nextInt();
		int t=sc.nextInt();
		ArrayDeque<Pair>q=new ArrayDeque<>();
	      int vis[]=new int[v];
	      Arrays.fill(vis,-1);
	      int c=0;
	      q.add(new Pair(src,1));
	      while(q.size()>0){
	          Pair r=q.removeFirst();
	          
	          if(vis[r.v]!=-1){
	              continue;
	          }
	          vis[r.v]=r.lev;
	          if(r.lev>t){
	              break;
	          }
	          c++;
	          
	          for(int e1: graph[r.v]){
	              if(vis[e1]==-1){
	                  q.add(new Pair(e1,r.lev+1));
	              }
	          }
	          
	      }
	      
	      System.out.println(c);

	}
	static class Pair{
	       int v;
	       int lev;
	       
	       Pair(int v,int lev){
	           this.v=v;
	           this.lev=lev;
	       }
	   }


}
