package Day9;

public class MissingNumber {
    public static int findMissing(int []arr){
        int xor1=0,xor2=0;
        for(int i=0;i<arr.length;i++){
            xor1^=arr[i];
            xor2^=(i+1);
        }
        return xor1^xor2;
    }
    public static void main(String[] args) {
        int []arr={0,1,2,4,3,6};
        System.out.println(findMissing(arr));
    }
}
