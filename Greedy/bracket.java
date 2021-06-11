package greedyA;
import java.util.*;
public class bracket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		
		Stack<Character>st=new Stack<>();
		for(int i=0;i<n;i++) {
			char ch=str.charAt(i);
			if(ch==']') {		
				if(st.size()==0 || st.peek()!='[') {
					st.push(ch);
				}else {
					st.pop();
				}
			}else {
				st.push(ch);
			}
		}
		System.out.println(st.size());

	}

}
