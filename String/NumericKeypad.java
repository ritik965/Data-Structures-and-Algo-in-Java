package problems;

public class NumericKeypad {

	public static void main(String[] args) {
		
		String arr[]= {"2","22","222", 
                "3","33","333", 
                "4","44","444", 
                "5","55","555", 
                "6","66","666", 
                "7","77","777","7777", 
                "8","88","888", 
                "9","99","999","9999"
               }; 
		String str="adg";
		String ans="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				ans+="0";
			}
			else {
				int j=ch-'a';
				ans+=arr[j];
			}
		}
		System.out.println(ans);

	}

}
