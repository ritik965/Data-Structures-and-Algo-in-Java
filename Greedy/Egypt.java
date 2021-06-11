package greedyA;

public class Egypt {

	public static void main(String[] args) {
		int nr=6,dr=14;
		print(nr,dr);
	
	}

	private static void print(int nr, int dr) {
		if(nr==0 || dr==0) {
			return;
		}
		
		
		if(dr%nr==0) {
			System.out.println("1/" + dr/nr);
			return;
		}
		
		if(nr%dr==0) {
			System.out.println(nr/dr);
			return;
		}
		
		if(nr>dr) {
			System.out.println(nr/dr + "+");
			print(nr%dr,dr);
			return;
		}
		
		int n=dr/nr+1;
		
		System.out.print("1/" + n + " + "); 
		print(nr*n-dr,dr*n);
		
		
	}
	

}
