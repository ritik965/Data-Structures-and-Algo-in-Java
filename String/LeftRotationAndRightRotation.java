package problems;

public class LeftRotationAndRightRotation {

	public static void main(String[] args) {
		
		String str="ritik";
		int d=2;
		
		System.out.println(rotate(str,d));
		System.out.println(right(str,str.length()-2));

	}
	
	private static String right(String str, int i) {
		
		return rotate(str,i);
	}

	public static String rotate(String str,int d) {
		
		String ans = str.substring(d) + str.substring(0, d);
		return ans;	
		
	}
	
	

}
