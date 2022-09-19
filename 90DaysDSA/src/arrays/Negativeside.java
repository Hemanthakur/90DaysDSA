package arrays;
/*Move negative number in begning*/
public class Negativeside {

	public static void main(String[] args) {
		int nums[]= {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		move(nums);
	}
	static void move(int nums[]) {
		int n=nums.length;
		int j=0,temp;
		for(int i=0;i<n;i++) {
			if(nums[i]<0) {
				if(i!=j) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			j++;
			}
		}
	for(int a:nums) {
		System.out.print(a+" ");
	}
	}
}
