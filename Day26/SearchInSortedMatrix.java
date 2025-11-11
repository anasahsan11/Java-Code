package Day26;

public class SearchInSortedMatrix {
    public static boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length,m=mat[0].length;
        int l=0,h=n*m-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int row=mid/m;
            int col=mid%m;
            if(mat[row][col]==x) return true;
            else if(mat[row][col]>x) h=mid-1;
            else l=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        int mat[][] = {{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
        int x=14;
        System.out.println(searchMatrix(mat,x));
    }
}
