package Day6;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr={13,46,24,52,20,9,2};
        for(int i=0;i<arr.length;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]) {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        System.out.println("After Sorting:");
        for(int x:arr){
            System.out.println(x);
        }
    }
}
