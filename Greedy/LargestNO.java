package greedyA;

import java.util.*;

public class LargestNO {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int s=sc.nextInt();
		int res[]=new int[d];
		for(int i=0;i<d;i++) {
			if(s>=9) {
				res[i]=9;
				s-=9;
			}else {
				res[i]=s;
				s=0;
			}
		}
		for(int i:res) {
			System.out.print(i);
		}

	}

}
