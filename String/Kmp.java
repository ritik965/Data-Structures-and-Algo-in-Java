package problems;

public class Kmp {

	static int c=0;
	static int max=100005;
	static int reset[]=new int[max];
	public static void main(String[] args) {
		
		
		
		String str="aaaaaaaaaa";
		String pat="aa";
		
		for(int i=0;i<max;i++) {
			reset[i]=-1;
		}
		kmpS(str,pat);
		System.out.println(c);
	}

	private static void kmpS(String str, String pat) {
		int i=0,j=0;
		kmp(pat,reset);
		while(i<str.length()) {
			while(j>=0 && str.charAt(i)!=pat.charAt(j)) {
				j=reset[j];
			}
			i++;j++;
			if(j==pat.length()) {
//				System.out.println("pattern found at "+(i-j));
				c++;
				j=reset[j];
			}
		}
		
		
	}

	private static void kmp(String pat, int[] reset) {
		
		int i=0;
		int j=-1;
		reset[0]=-1;
		while(i<pat.length()) {
			while(j>=0 && pat.charAt(i)!=pat.charAt(j)) {
				j=reset[j];
			}
			i++;
			j++;
			reset[i]=j;
		}
		
	}

}
