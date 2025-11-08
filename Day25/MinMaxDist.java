package Day25;
public class MinMaxDist {
    public static int numOfGasStationsReq(double dist, int []stations){
        
        int n=stations.length,cnt=0;
        for(int i=1;i<n;i++){
            int numberInBetween = (int)((stations[i] - stations[i - 1]) / dist);
            if ((stations[i] - stations[i - 1]) == (dist * numberInBetween)) {
                numberInBetween--;
            }
            cnt += numberInBetween;
        }
        return cnt;
    }
    public static double minMaxDist(int[] stations, int K) {
        // code here
        int n=stations.length;
        double l=0,h=0;
        for(int i=0;i<n-1;i++){
            h=Math.max(h,(double)(stations[i+1]-stations[i]));
        }
        
        double diff = 1e-6 ;
        while(h-l>diff){
            double mid = (l + h) / (2.0);
            int cnt = numOfGasStationsReq(mid, stations);
            if(cnt>K) l=mid;
            else h=mid;
        }
        return h;
    }
    public static void main(String[] args) {
        int []stations={3, 6, 12, 19, 33};
        int k=3;
        double ans=minMaxDist(stations, k);
        System.out.println(ans);
    }
}
