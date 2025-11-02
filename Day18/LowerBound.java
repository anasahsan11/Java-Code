package Day18;

public class LowerBound {
    public static int lowerBound(int []nums,int key){
        int l=0,h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>=key) h=mid-1;
            else l=mid+1;
        }
        return l;
    }
    public static void main(String[] args) {
        int []nums={3,5,8,15,19};
        int key=9;
        System.out.println("The lower bound of key:"+ lowerBound(nums,key));
    }
}
