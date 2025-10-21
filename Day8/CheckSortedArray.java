package Day8;

public class CheckSortedArray {
    public static boolean isArraySorted(int []arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,4};
        if(isArraySorted(arr)) System.out.println("The array is sorted");
        else System.out.println("The array is not sorted");
    }
}
