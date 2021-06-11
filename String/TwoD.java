package problems;

import java.util.*;

public class TwoD {

	public static void main(String[] args) {
		
		String str[]= {"flower","flight","flow"};
		String c=str[0];
		int min=Integer.MAX_VALUE;
		for(int i=1;i<str.length;i++) {
			int j=0;int k=0;
			int a=0;
			while(j<c.length() && k<str[i].length()) {
				if(c.charAt(j)==str[i].charAt(k)) {
					a++;
				}else break;
				j++;k++;
			}
			min=Math.min(min, a);
		}
		System.out.println(c.substring(0,min));
	}

}
