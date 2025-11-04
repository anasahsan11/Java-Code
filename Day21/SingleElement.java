package Day21;
public class SingleElement {
    public static int singleNumber(int []nums){
        int n=nums.length;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];

        int l=1,h=n-2;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
            else if((mid%2==0 && nums[mid]==nums[mid+1]) ||(mid%2==1 && nums[mid]==nums[mid-1])) l=mid+1;
            else h=mid-1;
        }
        return nums[l];
    }
    public static void main(String[] args) {
        int []nums={1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,9,9,11,11};
        System.out.println("The single number is:"+ singleNumber(nums));
    }
}
