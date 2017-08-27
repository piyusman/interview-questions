package test;

import java.util.Arrays;

public class PerfectSquares {
    public int numSquares(int a){
        
    
       int max = (int) Math.sqrt(a);
       int[] dp = new int[a+1];
       Arrays.fill(dp,  Integer.MAX_VALUE);
       for(int i=1;i<=a;i++){
           for(int j=1;j<=max;j++){
               if(i==j*j){
                   dp[i] =1;
               } else if(i>j*j){
                   dp[i] = Math.min(dp[i], dp[i-j*j]+1);
               }
           }
       }
       return dp[a];
    }
}
