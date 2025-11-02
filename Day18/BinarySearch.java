package Day18;
public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int n=nums.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) l=mid+1;
            else h=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []nums={1,3,5,6,7,8};
        int key=3;
        System.out.println("The index of key:" +binarySearch(nums,key) );
    }
}
