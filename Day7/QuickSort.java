package Day7;
public class QuickSort {
    public static int partition(int []arr,int low,int high){
        int pivot=arr[low];
        int i=low,j=high;
        while(i<j){
            while (arr[i]<=pivot && i<high) i++;
            while (arr[j]>=pivot && j>low) j--;
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void quickSort(int []arr,int low,int high){
        if(low>=high) return;
        int partIndex=partition(arr,low,high);
        quickSort(arr, low, partIndex-1);
        quickSort(arr, partIndex+1, high);
    }
    public static void main(String[] args) {
        int []arr={2, 1, 6, 10, 4, 1, 3, 9, 7};
        quickSort(arr,0,arr.length-1);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
