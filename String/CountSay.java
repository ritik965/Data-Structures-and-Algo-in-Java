package problems;
import java.util.*;
public class CountSay {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String ans=candsay(n);
		System.out.println(ans);
		sc.close();
	}

	private static String candsay(int n) {
		
		if(n==1) return "1";
		if(n==2) return "11";
		String s="11";
		for(int i=3;i<=n;i++) {
			int c=1;
			s=s+'@';
			String t="";
			for(int j=1;j<s.length();j++ ) {
				if(s.charAt(j)==s.charAt(j-1)) {
					c++;
				}else {
					t=t+String.valueOf(c);
					t+=s.charAt(j-1);
					c=1;
				}
			}
			s=t;
		}
		return s;
	}

}
