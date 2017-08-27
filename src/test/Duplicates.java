package test;

import java.util.HashMap;
import java.util.HashSet;

public class Duplicates {
    public boolean containsDuplicate(int[] nums){
        if(nums == null || nums.length == 0)
            return false;
       
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
     }
    
    //Given an array of integers and an integer k, return true if and only 
    //if there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
    
    public boolean containsNearbyDuplicate(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int pre = map.get(nums[i]);
                if(i-pre<=k){
                    return true;
                }
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
