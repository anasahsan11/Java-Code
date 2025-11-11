package Day26;

public class MaxCnt2D {
    public static int lowerBound(int []arr,int m,int x){
        int l=0,h=m-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>=x) h=mid-1;
            else l=mid+1;
        }
        return l;
    }
    public static int rowWithMax1s(int arr[][]) {
        
        int ans=-1,maxCnt=0;
        int n=arr.length,m=arr[0].length;
        for(int  i=0;i<n;i++){
            int cntOnes=m-lowerBound(arr[i],m,1);
            if(cntOnes>maxCnt){
                maxCnt=cntOnes;
                ans=i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][]arr = {{0,1,1,1}, {0,0,1,1}, {1,1,1,1}, {0,0,0,0}};
        System.out.println(rowWithMax1s(arr));
    }
}
