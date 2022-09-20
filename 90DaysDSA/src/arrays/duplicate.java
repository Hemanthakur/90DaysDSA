package arrays;

import java.util.HashSet;

public class duplicate {
	
	static boolean dupli(int[] nums) {
		HashSet<Integer> set=new HashSet<>();
		for(int i:nums) {
			if(set.contains(i)) {
				System.out.println("First Duplicate number is :"+i);
				return true;
			}
			else {
				set.add(i);
			}
		}
		return false;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,9,6,4,8,2};
		System.out.println("Contain Duplicate: "+dupli(nums));
	}

}
