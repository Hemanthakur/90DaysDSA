package arrays;

import java.util.Arrays;

public class KthMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums= {1,5,6,7,3,9,2};
		int k=4;
		System.out.println("kth Smallest element is: "+find(nums,k));
	}
	static int find(int[] nums,int k){
		int no=0;
		Arrays.sort(nums);
		no=nums[k-1];
		return no;
	}

}
