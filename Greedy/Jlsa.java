package greedyA;
import java.util.*;
public class Jlsa {

	public static void main(String[] args) {
		int arr[]= {-1,-2, 3, 5, 4, 1, 
	             2, 7, 6, 8, 9, 10};
		double p=0.10;
		int j=1; double res=0;
		int n=arr.length-1;
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		
		for(int i=1;i<n;i++) {
			pq.add(arr[i]);
		}
		
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());
			arr[j++]=pq.peek();
			pq.remove();
		}
		
		for(int i=n;i>=1;i--) {
			 res+=Math.pow((1-p),n-i)*arr[i];
		}
		
		System.out.printf("%.2f",res);
		
	}

}
