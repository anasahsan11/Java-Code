package Day10;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int []ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int moreNeeded=target-nums[i];
            if(map.containsKey(moreNeeded)){
                ans[0]=map.get(moreNeeded);
                ans[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int []nums={1,5,4,3,9,12,7,12};
        int []ans=twoSum(nums,11);
        for(int x:ans){
            System.out.print(x+" ");
        }
        
    }
}
