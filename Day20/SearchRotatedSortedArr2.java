package Day20;
public class SearchRotatedSortedArr2 {
    public static boolean search(int[] nums, int target) {
        int n=nums.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target) return true;
            //edge case
            else if(nums[l]==nums[mid] && nums[mid]==nums[h]){
                l++;
                h--;
                continue;
            }
            else if(nums[l]<=nums[mid]){
                if(nums[l]<=target && target<=nums[mid]) h=mid-1;
                else l=mid+1;
            }
            else{
                if(nums[mid]<=target && target<=nums[h]) l=mid+1;
                else h=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []nums={2,5,6,0,0,1,2};
        int target=0;
        System.out.println(search(nums,target));

    }
}
