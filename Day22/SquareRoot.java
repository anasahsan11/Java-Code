package Day22;
public class SquareRoot {
    public static int findSquareRoot(int n){
        if(n<2) return n;
        int l=0,h=n/2;
        while(l<=h){
            int mid=l+(h-l)/2;

            if(mid*mid<=n) l=mid+1;
            else h=mid-1;
        }
        return h;
    }
    public static void main(String[] args) {
        int n=289;
        System.out.println("The sqaure root of the number:"+ findSquareRoot(n));
    }
}
