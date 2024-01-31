/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TripletCount
{
	private static int countTriplets(int[] arr,int n){
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n-2;i++){
			for(int j=0;j<n-1;j++){
				for(int k=0;k<n;k++){
					if(arr[i]>=1 && arr[j]>arr[i] && arr[k]>arr[j] && arr[k]<=n){
						int val = Math.abs(arr[i]-arr[j]);
						int val2 = val*arr[k];
						if(val2>max){
							max = val2;
						}
					}
				}
			}
		}
		return max;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t!=0){
			int n = scan.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				int e = scan.nextInt();
				arr[i] = e;
			}
			int ans = countTriplets(arr,n);
			System.out.println(ans);
			t = t-1;
		}
	}
}