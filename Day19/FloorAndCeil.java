package Day19;

public class FloorAndCeil {
    static int findFloor(int []arr,int x){

        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]<=x) l=mid+1;
            else h=mid-1;
        }

        return arr[h];
    }

    static int findCeil(int []arr,int x){

        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>=x) h=mid-1;
            else l=mid+1;
        }

        return arr[l];
    }
    public static void main(String[] args) {
        int arr[] ={3, 4, 4, 7, 8, 10};
        int  x= 8;
        int floor=findFloor(arr,x);
        int ceil=findCeil(arr,x);
        System.out.println("The floor and ceil value is:" + floor +" "+ ceil);
    }
}
