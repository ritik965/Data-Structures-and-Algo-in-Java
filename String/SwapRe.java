package problems;
import java.util.*;
public class SwapRe {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    while(T--!=0){
	        String S=sc.next();
	        int N=S.length();
	        if((N&1)!=0) System.out.println(-1);
	        else{
	            int l=0,r=0;
    	        Stack<Character>st=new Stack<>();
    	        for(int i=0;i<N;i++){
    	            char ch=S.charAt(i);
    	            if(ch=='{'){
    	                st.push(ch);
    	                l++;
    	            }else if(ch=='}' && st.size()!=0 && st.peek()=='{'){
    	                st.pop();
    	                l--;
    	            }else{
    	                r++;
    	            }
    	        }
	        
	        if((l&1)!=0) l=(l/2)+1;
	        else l=l/2;
	        if((r&1)!=0) r=(r/2)+1;
	        else r=r/2;
	        System.out.println(l+r);
	    }

	}

}
}
