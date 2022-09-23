package arrays;

import java.util.Arrays;

public class MinsortedArray {
	 public static int findMin(int[] nums) {
	        Arrays.sort(nums);
	       int  min=nums[0];
	        return  min;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {3,4,5,1,2};
		System.out.println(findMin(nums));

	}

}
