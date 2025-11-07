package Day24;

public class AllocatePages {
    public static int findStudents(int []arr,int pages,int k){
        int s=1,pageStudents=0;
        for(int x:arr){
            if(pageStudents+x<=pages) pageStudents+=x;
            else{
                s++;
                pageStudents=x;
            }
        }
        return s;
    }
    public static int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        if(k>n) return -1;
        int sum=0,maxi=0;
        for(int x:arr){
            maxi=Math.max(maxi,x);
            sum+=x;
        }
        int l=maxi,h=sum;
        while(l<=h){
            int mid=l+(h-l)/2;
            int students=findStudents(arr,mid,k);
            if(students>k) l=mid+1;
            else h=mid-1;
        }
        return l;
        
    }
    public static void main(String[] args) {
        int []arr={12, 34, 67, 90};
        int k=2;
        System.out.println("ans:"+ findPages(arr,k));
    }
}
