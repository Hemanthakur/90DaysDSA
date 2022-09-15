package arrays;

public class Sort012 {

	public static void main(String[] args) {
		int nums[]= {0,2,1,2,2,0,1,0,2,0,1,1,0};
		sort(nums);
	}
	static void sort(int [] nums) {
		int z=0,o=0,t=0;
		int n=nums.length;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0)z++;
			if(nums[i]==1)o++;
			if(nums[i]==2)t++;
		}
		for(int i=0;i<z;i++) {
			nums[i]=0;
		}
		for(int i=z;i<o+z;i++) {
			nums[i]=1;
		}
		for(int i=o+z;i<n;i++) {
			nums[i]=2;
		}
		for(int s:nums) {
			System.out.print(n+" ");
		}
	}
}
