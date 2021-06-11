package problems;
import java.util.*;
import java.io.*;
public class ReverseInAString {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String line=br.readLine();
	    int t=Integer.valueOf(line);
	    while(t-->0)
	        {
	        String a=br.readLine();
	        String b=br.readLine();
	        System.out.println(compare(a,b));
	    }
	}
	
	public static String compare(String a,String b){

        int f=0;
        boolean arr[]=new boolean[26];
        for(int i=0;i<a.length();i++){
            arr[a.charAt(i)-'a']=true;
        }

        for(int i=0;i<b.length();i++){
            if(arr[b.charAt(i)-'a']){
                f=1;
                break;
            }
        }
        
        return f==1?"YES":"NO";

    }

}












