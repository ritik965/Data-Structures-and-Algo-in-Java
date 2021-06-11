package problems;

public class rotate {

	public static void main(String[] args) {
		
		String s1="abacd";
		String s2="cdaba";
		String temp=s1+s1;
		if(s1.length()==s2.length() && temp.indexOf(s2)!=-1) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

}
