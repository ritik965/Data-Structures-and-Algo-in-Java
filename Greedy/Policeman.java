package greedyA;
import java.util.*;
public class Policeman {

	public static void main(String[] args) {
		
		char arr[]= {'p','t','t','p','t','p','t'};
		int k=2;
		System.out.println(caught(arr,k));

	}

	private static int caught(char[] arr, int k) {
		int res=0;
		int l=0,r=0;
		ArrayList<Integer>pol=new ArrayList<Integer>();
		ArrayList<Integer>thi=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='p') {
				pol.add(i);
			}else {
				thi.add(i);
			}
		}
		
		while(l<thi.size()&&r<pol.size()) {
			if(Math.abs(thi.get(l)-pol.get(r))<=k) {
				res++;
				l++;
				r++;
			}
			
			else if(thi.get(l)<pol.get(r)) {
				l++;
			}else {
				r++;
			}
			
		}
		return res;
		
	}

}
