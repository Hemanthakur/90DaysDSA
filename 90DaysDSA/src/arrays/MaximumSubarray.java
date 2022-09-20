package arrays;

import java.util.Scanner;

public class MaximumSubarray {

		static void kadens(int arr[]) {
			int n=arr.length;
			int msf=Integer.MIN_VALUE;
			int mcs=0;
			for(int i=0;i<n;i++) {
				mcs+=arr[i];
				if(msf<mcs) {
					msf=mcs;
				}
				if(mcs<0) {
					mcs=0;
				}
		}
			System.out.println(msf);
		}
		
	public static void main(String[] args) {
		int [] arr= {-2,1,-3,4,-1,2,1,4,-5,4};
		kadens(arr);
	}

}
