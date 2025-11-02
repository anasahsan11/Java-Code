package Day19;

public class CountTotalOccur {
    public static int firstOccurence(int [] nums,int target){
        int n=nums.length;
        int l=0,h=n-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                ans=mid;
                h=mid-1;
            }
            else if(nums[mid]>target) h=mid-1;
            else{
                l=mid+1;
            }
        }
        return ans;
    }

    public static int lastOccurence(int [] nums,int target){
        int n=nums.length;
        int l=0,h=n-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                ans=mid;
                l=mid+1;
            }
            else if(nums[mid]<target) l=mid+1;
            else{
                h=mid-1;
            }
        }
        return ans;
    }
    public static int[] searchRange(int[] nums, int target) {
       
        int f=firstOccurence(nums,target);
        if(f==-1) return new int []{-1,-1};
        int l=lastOccurence(nums,target);
        int []ans={f,l};
        return ans;
    }
    public static int count(int []nums,int target){
        int[] ans = searchRange(nums, target);
        if (ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }

    public static void main(String[] args) {
        int []nums={5,7,7,7,7,7,8,8,10};
        int target=7;
        System.out.println("The total number of occurences:" + count(nums,target));

    }
}
