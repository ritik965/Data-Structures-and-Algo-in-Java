package problems;
import java.util.*;
public class differnce {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
	    String s2=sc.next();
	    char xor=s1.charAt(0);
	    for(int i=1;i<s1.length();i++){
	        char ch=s1.charAt(i);
	        xor=(char) (xor^ch);
	    }
	    for(int i=0;i<s2.length();i++){
	        char ch=s2.charAt(i);
	        xor=(char) (xor^ch);
	    }
	    
	    
		System.out.println(xor);
	

	}

}
