package problems;
import java.util.*;
public class ImplememntAtoi {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int ans=ato(s);
		System.out.println(ans);
		
	}

	private static int ato(String s) {
		int res=0;
		int sign=1;
		int i=0;
        if(s.length()==0) return 0;
        while(s.charAt(i)==' ' && i<s.length()){
            i++;
        }
        
		if(s.charAt(i)=='-') {
			sign=-1;
			i++;
		}
		
		for(;i<s.length();i++) {
			if(s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9) {
				res=res*10+s.charAt(i)-'0';
			}else {
				return -1;
			}
		}
			
		return (res*sign);

	}

}
