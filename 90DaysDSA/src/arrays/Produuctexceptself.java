package arrays;

import java.util.Arrays;

public class Produuctexceptself {
	
	static int [] product(int[]nums) {
		if(nums.length==0||nums==null)return new int[0];
		
		int rp=1;
		int res[]=new int[nums.length];
		int n=nums.length;
		for(int i=0;i<n;i++) {
			res[i]=rp;
			rp=rp*nums[i];
		}
		rp=1;
		for(int i=n-1;i>=0;i--) {
			res[i]=res[i]*rp;
			rp=rp*nums[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,4};

	System.out.println(Arrays.toString(product(nums)));
	}

}
