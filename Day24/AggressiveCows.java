package Day24;
import java.util.Arrays;

public class AggressiveCows {
    public static boolean canWePlace(int []stalls,int dist,int k){
        int cowsCnt=1,lastCow=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastCow>=dist){
                cowsCnt++;
                lastCow=stalls[i];
            }
        }
        return cowsCnt>=k?true:false;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        
        // code here
        Arrays.sort(stalls);
        int n=stalls.length;
        if(k==2) return stalls[n-1]-stalls[0];
        
        int l=1,h=stalls[n-1]-stalls[0];
        while(l<=h){
            int mid=l+(h-l)/2;
            if(canWePlace(stalls,mid,k)) l=mid+1;
            else h=mid-1;
        }
        return h;
    }
    public static void main(String[] args) {
        int []stalls={1,2,4,8,9};
        int k=3;
        System.out.println("The max distance:"+aggressiveCows(stalls,k));
    }
}
