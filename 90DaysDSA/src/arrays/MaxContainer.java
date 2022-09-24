package arrays;

public class MaxContainer {
	 public static int maxArea(int[] height) {
	     int l=0,r=height.length-1;   
	    int max=0;
	    int area=0;
	    while(l<r){
	        area=Math.min(height[l],height[r])*(r-l);
	        if(area>max)max=area;
	        if(Math.min(height[l],height[r])==height[l]){
	            l++;
	        }else{
	          r--;
	        }
	    }
	    return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[]= {1,8,6,2,5,4,8,3,7};
	System.out.println(maxArea(height));
	}

}
