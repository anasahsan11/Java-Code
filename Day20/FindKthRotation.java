package Day20;

public class FindKthRotation {
    public static int findKRotation(int arr[]) {
        // Code here
        int l=0,h=arr.length-1,index=0;
        int ans=Integer.MAX_VALUE;
        if(arr[l]<=arr[h]) return 0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[l]<=arr[mid]){
                if(arr[l]<ans){
                    ans=arr[l];
                    index=l;
                }
                l=mid+1;
            } else {
                if(arr[mid]<ans){
                    ans=arr[mid];
                    index=mid;
                }
                h=mid-1;
            }
            
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4};
        System.out.println("The no of rotation:"+ findKRotation(arr));
    }
}
