package test;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargest {

    public int findKthLargest(int[] nums, int k){
        Arrays.sort(nums);
        return nums[nums.length -k];
    }
    
    public int heapKth(int[] nums, int k){
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i:nums){
            q.offer(i);
            if(q.size()>k){
                q.poll();
            }
        }
        return q.peek();
    }
}
