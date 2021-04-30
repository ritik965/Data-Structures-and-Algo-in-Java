package hamiltonian;
import java.util.*;
public class HamiltonianCycleAndPath {

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
		HashSet<Integer>hm=new HashSet<>();
		hamiltonian(graph,hm,src,src+"",src);
		

	}

	private static void hamiltonian(ArrayList<Integer>[] graph, HashSet<Integer> hm, int src, String psf, int src2) {
		
		
		
		if(hm.size()==graph.length-1) {
			
			System.out.print(psf);
			boolean f=false;
			for(int i:graph[src]) {
				if(i==src2) {
					f=true;
				}
			}
			if(f==true) {
				System.out.println("*");
			}else {
				System.out.println(".");
			}
		}
		
		hm.add(src);
		for(int i:graph[src]) {
			if(hm.contains(i)==false) {
				hamiltonian(graph,hm,i,psf+i,src2);
			}
		}
		hm.remove(src);
		
	}

}
