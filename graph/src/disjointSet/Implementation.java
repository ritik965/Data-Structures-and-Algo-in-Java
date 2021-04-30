package disjointSet;

public class Implementation {

	static int rank[]=new int[100000];
	static int parent[]=new int[100000];
	static int n=7;
	
	public static void main(String[] args) {
		
		make();
		int u=4;
		int v=3;
		union(u,v);
		if(parent[u]!=parent[v]) {
			System.out.println("different");
		}else {
			System.out.println("same");
		}
		
		
	}
	
	public static void make() {
		for(int i=1;i<=n;i++) {
			parent[i]=i;
			rank[i]=0;				
		}
	}
	
	public static void union(int u,int v) {
		u=findParent(u);
		v=findParent(v);
		
		if(rank[u]<rank[v]) {
			parent[u]=v;
		}else if(rank[v]<rank[u]) {
			parent[v]=u;
		}else {
			parent[v]=u;
			rank[u]++;
		}
		
	}

	//7-6-4-3
	//after adding this parent node this is path compressed
	public static int findParent(int node) {
		if(node==parent[node]) {
			return node;
		}
		return parent[node]=findParent(parent[node]);
	}
}
// TC--O(m)