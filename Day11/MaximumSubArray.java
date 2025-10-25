package Day11;
public class MaximumSubArray {
    public static int maximumSubarraySum(int []arr){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int x:arr){
            sum+=x;
            if(sum>maxSum) maxSum=sum;
            if(sum<0) sum=0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int []arr={-2,1,-3,4,-1,2,1,1,-5,3};
        System.out.println(maximumSubarraySum(arr));
    }
}
