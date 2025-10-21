package Day8;

public class LeftRotateByK {

    public static void reverse(int []arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void leftRotateByK(int []arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }

    public static void rightRotateByK(int []arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        //leftRotateByK(arr,9);
        rightRotateByK(arr,2);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
