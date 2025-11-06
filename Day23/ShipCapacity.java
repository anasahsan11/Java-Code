package Day23;

public class ShipCapacity {
    static boolean isPossible(int []arr,int limit,int d){
        int wt=0,dayCnt=1;
        for(int x:arr){
            if(wt+x<=limit) wt+=x;
            else{
                dayCnt++;
                wt=x;
            }
        }
        return dayCnt<=d;
    }
    static int leastWeightCapacity(int[] arr,int d) {
        int maxi=0,sum=0;
        
        for(int x:arr){
            sum+=x;
            maxi=Math.max(maxi,x);
        }
        
        int l=maxi,h=sum;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isPossible(arr,mid,d)) h=mid-1;
            else l=mid+1;
        }
        return l;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int d=5;
        System.out.println("The min capacity:"+ leastWeightCapacity(arr,d));
    }
}
