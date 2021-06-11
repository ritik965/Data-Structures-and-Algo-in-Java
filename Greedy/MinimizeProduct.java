package greedyA;

import java.util.Arrays;

public class MinimizeProduct {

	public static void main(String[] args) {
		
		int a[]= {3,1,1};
		int n=a.length;
		int b[]= {6,5,4};
		long ans=0;
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<n;i++) {
			ans+=a[i]*b[n-i-1];
		}
		System.out.println(ans);
	}

}
