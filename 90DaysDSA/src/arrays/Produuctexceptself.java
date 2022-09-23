package arrays;

public class Produuctexceptself {
	
	static void product(int[]nums) {
		if(nums.length==0||nums==null)return;
		
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
		for(int i:res) {
			System.out.print(i+" ");
		}
		//return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,4};
		product(nums);
//		System.out.println(product(nums));
	}

}
