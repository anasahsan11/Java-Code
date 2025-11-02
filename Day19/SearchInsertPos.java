package Day19;
public class SearchInsertPos {
    public static int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>=target) h=mid-1;
            else l=mid+1;
            
        }
        return l;
    }
    public static void main(String[] args) {
        int []arr={1,3,5,6};
        int key=7;
        System.out.println("The insert position of key:"+searchInsert(arr,key));
    }
}
