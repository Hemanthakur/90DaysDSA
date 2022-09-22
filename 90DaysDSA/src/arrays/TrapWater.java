package arrays;

public class TrapWater {
	
	static public int trap(int[] height) {
	        int n=height.length;
	        int [] left=new int[n];
	        int [] right=new int[n];
	        int max=0;
	        int totalwater=0;
	        for(int i=0;i<n;i++){
	            max=Math.max(max,height[i]);
	            left[i]=max;
	        }
	        max=0;
	        for(int i=n-1;i>=0;i--){
	            max=Math.max(max,height[i]);
	            right[i]=max;
	        }
	        for(int i=n-1;i>=0;i--){
	            int water=Math.min(left[i],right[i])-height[i];
	            totalwater+=water;
	        }
	        
	        return totalwater;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] height= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));
	}

}
