package Day10;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        //Moore's Voting Algo
        int cnt=0;
        int el=0;
        for(int x:nums){
            if(cnt==0){
                cnt=1;
                el=x;
            }
            else if(x==el) cnt++;
            else cnt--;
        }

        int cnt1=0;
        for(int x:nums){
            if(x==el) cnt1++;
        }
        if(cnt1>nums.length/3) return el;
        return -1;
    }
    public static void main(String[] args) {
        int []nums={1,2,2,1,1,1,4,3,2,3,1,5,5,5,1,1,1,5,5,5,5,5,5,5,5};
        System.out.println(majorityElement(nums));
    }
}
