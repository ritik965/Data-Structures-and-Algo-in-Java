package problems;
import java.util.*;
public class RemoveDupli {

	public static void main(String args[]) {
		
		
		String s="ritikk";
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
		}
		
		for(Character k:map.keySet()) {
			if(map.get(k)>1) {
				System.out.println(k+" count "+map.get(k));
			}
		}
		
	}
}
