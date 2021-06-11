package greedyA;

import java.util.*;

public class Huffman {
	
//	public static class Listnode{
//		int data;
//		char c;
//		
//		Listnode left;
//		Listnode right;
//		
//	}
//	
//	public static class myclass implements Comparator<Listnode>{
//
//		public int compare(Listnode x,Listnode y){
//			return x.data-y.data;
//		}
//		
//	}
//
//	public static void main(String[] args) {
//		
//		int n=6;
//		char c[]= {'a', 'b', 'c', 'd', 'e', 'f' };
//		int freq[]= {5, 9, 12, 13, 16, 45};
//		
//		PriorityQueue<Listnode>pq=new PriorityQueue<Listnode>(n,new myclass());
//		for(int i=0;i<n;i++) {
//			Listnode node =new Listnode();
//			node.c=c[i];
//			node.data=freq[i];
//			node.left=null;
//			node.right=null;
//			pq.add(node);
//		}
//		Listnode root=null;
//		while(pq.size()>1) {
//			Listnode x=pq.poll();
//			Listnode y=pq.poll();
//			Listnode f=new Listnode();
//			f.data=x.data+y.data;
//			f.c='-';
//			f.left=x;
//			f.right=y;
//			root=f;
//			pq.add(f);
//			
//		}
//		print(root,"");
//		
//	}
//
//	private static void print(Listnode root, String s) {
//		if(root.left==null && root.right==null && Character.isLetter(root.c)) {
//			System.out.println(root.c+ " - "+s);
//			return;
//		}
//		
//		print(root.right,s+"1");
//		print(root.left,s+"0");
//	}
	
	
	public static class Listnode{
		int data;
		char c;
		
		Listnode left;
		Listnode right;
		
	}
	
	public static class myclass implements Comparator<Listnode>{

		public int compare(Listnode x,Listnode y){
			return x.data-y.data;
		}
		
	}
    
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T--!=0){
		    String s=sc.next();
		    int n=s.length();
		    System.out.println(n);
		    int freq[]=new int[n];
		    for(int i =0;i<n;i++){
		        freq[i]=sc.nextInt();
		    }
		    
		    System.out.println(n);
    		PriorityQueue<Listnode>pq=new PriorityQueue<Listnode>(n,new myclass());
    		for(int i=0;i<n;i++) {
    			Listnode node =new Listnode();
    			node.c=s.charAt(i);
    			node.data=freq[i];
    			node.left=null;
    			node.right=null;
    			pq.add(node);
    		}
    		Listnode root=null;
    		while(pq.size()>1) {
    			Listnode x=pq.poll();
    			Listnode y=pq.poll();
    			Listnode f=new Listnode();
    			f.data=x.data+y.data;
    			f.c='-';
    			f.left=x;
    			f.right=y;
    			root=f;
    			pq.add(f);
    			
    		}
    		print(root,"");
    		    
		}

	}
	
		public static void print(Listnode root, String s) {
		if(root.left==null && root.right==null && Character.isLetter(root.c)) {
			System.out.println(root.c+ ": "+s);
			return;
		}
		print(root.left,s+"0");
		print(root.right,s+"1");
	
	   }
	
	
	
}
