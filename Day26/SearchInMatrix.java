package Day26;

public class SearchInMatrix {
    public static boolean binarySearch(int []arr,int m,int target){
        int l=0,h=m-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target) return true;
            else if(arr[mid]>target) h=mid-1;
            else l=mid+1;
        }
        return false;
    }

    public  static boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[i][0]<=target && matrix[i][m-1]>=target){
                if(binarySearch(matrix[i],m,target)) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][]matrix={{2,3,5,6,7},{1,3,4,8,9},{5,6,10,12,15},{11,14,16,17,19}};
        int target=16;
        System.out.println(searchMatrix(matrix, target));
    }
}
