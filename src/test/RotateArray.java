package test;

public class RotateArray {

    public void rotate(int[] nums, int k){
        if(nums == null || nums.length<2){
            throw new IllegalArgumentException("Illegal argument!");
        }
        if(k > nums.length){
            k = k%nums.length;
        }
        int a = nums.length - k;
        reverse(nums,0,a-1);
        reverse(nums,a,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    
    public static void reverse(int[] nums, int left, int right){
        if(nums == null || nums.length<2){
            return;
        }
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
