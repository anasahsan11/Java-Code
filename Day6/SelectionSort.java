package Day6;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={12,1,3,21,78,56};

        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]) min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        for(int x:arr){
            System.out.println(x);
        }
    }
}
