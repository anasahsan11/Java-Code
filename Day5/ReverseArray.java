package Day5;

public class ReverseArray {
    static void reverseArray(int []arr,int s,int e){
        if(s>e) return;
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        reverseArray(arr, s+1, e-1);
    }
    public static void main(String[] args) {
        int []arr={7,6,5,4,3,2,1};
        reverseArray(arr,0,arr.length-1);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
