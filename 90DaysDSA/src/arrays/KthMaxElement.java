package arrays;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthMaxElement {
	static int find(int [] nums,int k) {
		Queue<Integer> pq=new PriorityQueue<>(k+1);
		for(int i:nums) {
			pq.offer(i);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		return pq.poll();
	}
	static int findmin(int [] nums,int k) {
		Queue<Integer> pq=new PriorityQueue<>(k+1,Comparator.reverseOrder());
		for(int i:nums) {
			pq.offer(i);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		return pq.poll();
	}
	public static void main(String[] args) {
		int [] nums= {7,10,4,3,20,15};
		int k=3;
	System.out.println("kth max element:"+find(nums,k));
	System.out.println("kth min element:"+findmin(nums,k));
	}

}
