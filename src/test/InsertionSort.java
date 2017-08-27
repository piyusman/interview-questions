package test;

public class InsertionSort {
 public int[] doInsertionSort(int[] arr){
     int temp;
     for(int i =1; i<arr.length-1;i++){
         for(int j=i;j>0;j--){
             if(arr[j]<arr[j-1]){
                 swap(arr,j,j-1);
             }
         }
     }
     return arr;
 }
 public void swap(int[] arr, int left, int right){
     int temp = arr[left];
     arr[left] = arr[right];
     arr[right] = temp;
 }
}
