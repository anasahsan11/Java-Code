package Day8;

public class LeftRotateByOne {
    public static void leftRotate(int []arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
    public static void rightRotate(int []arr){
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        //leftRotate(arr);
        rightRotate(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
