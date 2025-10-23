package Day10;
public class Sort012 {
    public static void sort012(int[] arr) {
       
        int left=0,mid=0,right=arr.length-1;
        while(mid<=right){
            if(arr[mid]==0){
                int temp=arr[left];
                arr[left]=arr[mid];
                arr[mid]=temp;
                left++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else{
                int temp=arr[mid];
                arr[mid]=arr[right];
                arr[right]=temp;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={1,0,2,2,2,1,1,0,1,0,1};
        sort012(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
