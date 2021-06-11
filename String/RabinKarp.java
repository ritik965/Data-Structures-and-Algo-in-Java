package problems;

public class RabinKarp {

	static long prime=119;
	
	public static long hash(String str,int n) {
		long res=0;
		for(int i=0;i<n;i++) {
			res+=(long)str.charAt(i)*(long)Math.pow(prime, i);
		}
		return res;
	}
	
	public static long rehash(String str,int old,int newindex,long oldhash,int pat) {
		long newhash=oldhash-str.charAt(old);
		newhash/=prime;
		newhash+=(long)str.charAt(newindex)*(long)Math.pow(prime,pat-1);
		return newhash;
	}
	
	public static boolean check(String str1,String str2,int start1,int end1,int start2,int end2) {
		if(end1-start1!=end2-start2) {
			return false;
		}
		while(start1<=end1 && start2<=end2) {
			if(str1.charAt(start1)!=str2.charAt(start2)) {
				return false;
			}
			start1++;
			start2++;
		}
		return true;
	}
	public static void main(String[] args) {
		
		String str="THIS IS A TEST TEXT";
		String pat="TEST";
		long strhash=hash(str,pat.length());
		long pathash=hash(pat,pat.length());
		for(int i=0;i<=str.length()-pat.length();i++) {
			if(pathash==strhash && check(str,pat,i,i+pat.length()-1,0,pat.length()-1)) {
			   System.out.println("pattern found at "+i+" ");
			}
			if(i<str.length()-pat.length()) {
				strhash=rehash(str,i,i+pat.length(),strhash,pat.length());
			}

		}
	}

}
