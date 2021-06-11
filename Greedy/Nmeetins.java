package greedyA;

import java.util.*;

public class Nmeetins {
	
	public static class pair implements Comparator<pair>{
		
		int s;
		int e;
		int p;
		
		pair(int s,int e,int p){
			this.s=s;
			this.e=e;
			this.p=p;
		}
		
		public int compare(pair o,pair m) {
			
			if(o.e>m.e) return 1;
			else if(o.e<m.e) return -1;
			else if(o.p<m.p) return -1;
			return 1;
		}
		
		
	}

	public static <T> void main(String[] args) {
		
		
		int s[] = { 1, 0,3,8,5,8 };
		int e[] = { 2, 6,4,9,7,9 };  
		ArrayList<pair>ar=new ArrayList<>();
		
		for(int i=0;i<s.length;i++) {
			ar.add(new pair(s[i],e[i],i+1));
		}
		
		Collections.sort(ar,new pair(0, 0, 0));
		
		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(ar.get(0).p);
		int l=ar.get(0).e;
		for(int i=1;i<s.length;i++) {
			if(ar.get(i).s>l) {
				l=ar.get(i).e;
				arr.add(ar.get(i).p);
			}
		}
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(ar.get(i).p+" ");
		}
		
	}

}
