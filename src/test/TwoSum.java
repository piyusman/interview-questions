package test;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
    
    private ArrayList<Integer> nums = new ArrayList<>();
    HashMap<Integer,Integer> numbers = new HashMap<>();
    public void twoSum(ArrayList<Integer> list, int target){
        if(list == null || list.size()<2){
            return;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : list){
        if(map.containsKey(i)){
            System.out.println(i+ "" + (target-i));
        }
        else {
            map.put(target-i, i);
        }
    }
    }
    
    public void add(int a){
        if(numbers.containsKey(a)){
            numbers.put(a, numbers.get(a)+1);
        }
        
    }
    
    public void find(int target){
        for(int num : numbers.keySet()){
            if(numbers.containsKey(target-num)){
                if(num == target-num && numbers.get(num)<2 ){
                    continue;
                }
                System.out.println("Success");
            }
            
        }
        
    }
}
