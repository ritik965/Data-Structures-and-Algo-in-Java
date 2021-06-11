package greedyA;
import java.util.*;
public class RailwayPlat {

	public static void main(String[] args) {
		
		
		int n=6;
		int arr[] = {900 , 940, 950 , 1100, 1500, 1800};
		int dep[] = {910 ,1200 ,1120 ,1130 ,1900 ,2000};
		
		 Arrays.sort(arr);
	        Arrays.sort(dep);
	        int plat=1,max=1;
	        int i=1,j=0;
	        while(i<n && j<n){
	            if(arr[i]<=dep[j]){
	                plat++;
	                i++;
	            }else if(arr[i]>dep[j]){
	                plat--;
	                j++;
	            }
	            if(max<plat){
	                max=plat;
	            }
	        }
	        System.out.println(max);

	}

}
