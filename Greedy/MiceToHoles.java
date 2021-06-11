package greedyA;

import java.util.*;

public class MiceToHoles {

	public static void main(String[] args) {
		
		ArrayList<Integer>mice=new ArrayList<>();
		ArrayList<Integer>holes=new ArrayList<>();
		mice.add(4);
		mice.add(-4);
		mice.add(2);
		holes.add(5);
		holes.add(4);
		holes.add(0);
		Collections.sort(mice);
		Collections.sort(holes);
		int max=0;
		if(mice.size()!=holes.size()) System.out.println("-1");
		for(int i=0;i<mice.size();i++) {
			if(max<Math.abs(mice.get(i)-holes.get(i))) {
				max=Math.abs(mice.get(i)-holes.get(i));
			}
		}
		System.out.println(max);
		
	}

}
