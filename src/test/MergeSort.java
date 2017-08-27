package test;

public class MergeSort {
    
    private int[] numbers;
    private int length;
    private int[] helper;
    
    public void sort(int [] values){
        this.numbers = values;
        length = values.length;
        this.helper = new int[length];
        mergeSort(0,length-1);
   }
    public void mergeSort(int low, int high){
        if(low<high){
            int mid = low+(high-low)/2;
            mergeSort(low,mid);
            mergeSort(mid+1,high);
            merge(low,mid,high);
        }
    }
    
    public void merge(int low, int mid , int high){
        System.out.println("------------");
        for(int i =low; i<=high;i++){
            helper[i] = numbers[i];
            
            System.out.println(numbers[i]);
        }
        int i= low;
        int j = mid+1;
        int k = low;
        
        while(i<=mid && j<=high){
            if(helper[i]<=helper[j]){
                numbers[k] = helper[i];
                i++;
            }
            else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            numbers[k] = helper[i];
            k++;
            i++;
        }
    }
    
    public static void main(String args[]){
        int[] values = {2,4,3,5,3,2,3,7,65,45,3,243,12};
        MergeSort merge = new MergeSort();
        merge.sort(values);
        for(int a : values){
        System.out.println(a);
    }
    }
}
