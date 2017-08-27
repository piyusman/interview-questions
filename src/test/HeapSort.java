package test;

public class HeapSort {
 private static int N;
 
     public void sort(int arr[]){
        heapify(arr);
        for(int i =N; i>0;i--){
            swap(arr,0,i);
            N=N-1;
            maxHeap(arr,0);
        }
     }
     
     public void heapify(int[] arr){
         N = arr.length -1;
         for(int i= N/2;i>=0;i--){
             maxHeap(arr,i);
         }
     }
     
     public void maxHeap(int[] arr, int i){
         int left = i*2;
         int right = i*2 + 1;
         int max = i;
         if(left<= N && arr[left] > arr[i]){
             max = left;
         }
         if(right<=N && arr[right]>arr[i]){
             max = right;
         }
         if(max != i){
             swap(arr,i,max);
             maxHeap(arr,max);
         }
     }
     
     public void swap(int[] arr, int left, int right){
         int temp = arr[left];
         arr[left] = arr[right];
         arr[right] = temp;
     }
     {
         }
}
