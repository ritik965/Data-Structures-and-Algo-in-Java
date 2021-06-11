package problems;

public class ValidShuffle {

	public static void main(String[] args) {
		
		String s="xy";
		String s1="12";
		String res="x1y2";
		
		if(s.length()+s1.length()!=res.length()) {
			System.out.println("no");
		}else {
			int f=0;
			int i=0;int j=0;int k=0;
			
			while(k<res.length()) {
				if(i<s.length() && s.charAt(i)==res.charAt(k)) {
					i++;
				}
				else if(j<s1.length() && s1.charAt(j)==res.charAt(k)){
					j++;
				}else {
					f=1;
					break;
				}
			}
			if(i<s.length() || j<s1.length()) {
				System.out.println("no");
			}else {
				System.out.println("yes");
			}
			
			
			
			
			
		}
		

	}

}
