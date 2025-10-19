package Day7;

public class BubbleRecursion {
    public static void bubbleSort(int []arr,int n){
        if(n==0) return;
        for(int j=0;j<n;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        bubbleSort(arr, n-1);
    }
    public static void main(String[] args) {
        int []arr={2, 1, 6, 10, 4, 1, 3, 9, 12,56,21};
        bubbleSort(arr,arr.length-1);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
