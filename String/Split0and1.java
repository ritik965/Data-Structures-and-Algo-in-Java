package problems;

import java.util.*;

public class Split0and1 {

	public static void main(String[] args) {
		
		String s="0100110101";
		int x=0;int y=0;int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='0') {
				x++;
			}else {
				y++;
			}
			if(x==y) c++;
		}
		if(x!=y) System.out.println(-1);
		else System.out.println(c);
		
	}
}






