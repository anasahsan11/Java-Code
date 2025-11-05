package Day22;

public class KokoEatingBanana {
    public static int findMax(int []arr){
        int maxi=Integer.MIN_VALUE;
        for(int x:arr) maxi=Math.max(maxi,x);
        return maxi;
    }
    public static boolean isPossible(int []arr,int hr,int hourly){
        int totalHour=0;
        for(int x:arr){
            totalHour+=Math.ceil((double)x/(double)hourly);
        }
        return totalHour<=hr;
    }
    public static int minEatingSpeed(int []arr,int hr){
        int l=1,h=findMax(arr);
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isPossible(arr,hr,mid)) h=mid-1;
            else l=mid+1;
        }
        return l;
    }
    public static void main(String[] args) {
        int arr[] = {25,12,8,14,19};
        int hr=5;
        System.out.println(minEatingSpeed(arr,hr));
    }
}
