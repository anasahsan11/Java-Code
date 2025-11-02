package Day19;

public class FirstAndLast {
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
    public static void main(String[] args) {
        int []nums={5,7,7,8,8,10};
        int target=6;
        int []ans=new int[2];
        ans=searchRange(nums,target);
        System.out.println("First occurence: "+ans[0]);
        System.out.println("Last occurence: "+ans[1]);
    }
}
