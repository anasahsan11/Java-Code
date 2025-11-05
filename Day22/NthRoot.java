package Day22;
public class NthRoot {
    public static int func(int mid,int n,int m){
        long ans=1;
        for(int i=1;i<=n;i++){
            ans*=mid;
            if(ans>m) return 2;
        }
        if(ans==m) return 1;
        return 0;
    }
    public static int nthRoot(int n, int m) {
        // code here
        int l=0,h=m;
        while(l<=h){
            int mid=l+(h-l)/2;
            int midN=func(mid,n,m);
            if(midN==1) return mid;
            else if(midN==0) l=mid+1;
            else h=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=4,m=625;
        System.out.println("The nth root:"+ nthRoot(n,m));

    }
}
