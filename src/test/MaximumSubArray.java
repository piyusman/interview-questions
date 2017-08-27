package test;

public class MaximumSubArray {
    
    public int maxArray(int[] A){
        int max = A[0];
        int[] sum = new int[A.length];
        sum[0] = A[0];
        for(int i = 1; i<A.length;i++){
            sum[i] = Math.max(A[i], sum[i-1] + A[i]);
            max = Math.max(max, sum[i]);
        }
        return max;
    }
    
    public static void main(String args[]){
        int A[] = {1,2,9,4,5,6,7};
        MaximumSubArray m = new MaximumSubArray();
        int max = m.maxArray(A);
        int max2 = m.maxArray2(A);
        System.out.println(max);
        System.out.println(max2);
    }
    
    public int maxArray2(int[] A){
        int newSum = A[0];
        int max = A[0];
        for(int i =1; i<A.length;i++){
            newSum = Math.max(newSum+A[i], A[i]);
            max = Math.max(max,newSum);
        }
        return max;
    }

}
