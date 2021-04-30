package endArray;
import java.util.*;

public class end {

	public static void main(String[] args) {
		       
				int a[]={4,2,2,6,4};
				int k=6;
				int xor=0,count=0;
				HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
				for(int i=0;i<a.length;i++) {
					xor=xor^a[i];
					if(h.get(xor^k)!=null) {
						count+=h.get(xor^k);
					}
					if(xor==k) {
						count++;
					}
					if(h.get(xor)!=null) {
						h.put(xor, h.get(xor)+1);
					}else {
						h.put(xor,1);
					}
				}
			    System.out.println(count);
		    }

	}

