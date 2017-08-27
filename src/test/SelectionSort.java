package test;

public class SelectionSort {
    public static int[] doSelectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
    
    public static int[] ss(int[] arr){
        for(int i =0; i<arr.length;i++){
            int index =i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index =j;
                }
                    int smallnumber = arr[index];
                    arr[index] = arr[i];
                    arr[i] = smallnumber;
                
            }
        }
        return arr;
    }
}
