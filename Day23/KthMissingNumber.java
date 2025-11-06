package Day23;

public class KthMissingNumber {
    public static int kthMissingNumber(int []arr,int k){
        int l=0,h=arr.length-1;
        while (l<=h) {
            int mid=l+(h-l)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k) l=mid+1;
            else h=mid-1;
        }
        return k+h+1;
    }
    public static void main(String[] args) {
        int []arr={4,7,9,10};
        int k=2;
        System.out.println("The kth missing positive number:"+ kthMissingNumber(arr,k));
    }
}
