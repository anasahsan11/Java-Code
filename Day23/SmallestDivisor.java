package Day23;

public class SmallestDivisor {
    public static boolean isPossible(int []arr,int div,int threshold){
        int sum=0;
        for(int x:arr){
            sum+=(int)Math.ceil((double)x/(double)div);
        }
        return sum<=threshold;
    }
    public static int findSmallestDivisor(int []arr,int threshold){
        int maxi=Integer.MIN_VALUE;
        for(int x:arr) maxi=Math.max(maxi, x);

        int l=1,h=maxi;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isPossible(arr,mid,threshold)) h=mid-1;
            else l=mid+1;
        }
        return l;
    }
    public static void main(String[] args) {
        int []arr={44,22,33,11,3};
        int threshold=5;
        System.out.println("The smallest divisor given a threshold is:"+ findSmallestDivisor(arr,threshold));
    }
}
