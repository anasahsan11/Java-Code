package Day7;

public class InsertionRecursion {
    public static void insertionSort(int []arr,int i,int n){
        if(i==n) return;
        int j=i;
        while (j>0 && arr[j-1]>arr[j]) {
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
        insertionSort(arr, i+1, n);
    }
    public static void main(String[] args) {
        int []arr={2, 1, 6, 10, 4, 1, 3, 9, 12,56,21};
        insertionSort(arr,0,arr.length);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
