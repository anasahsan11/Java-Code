package Day9;

public class SingleNumber {
    public static int findSingleNumber(int []arr){
        int xor=0;
        for(int x:arr){
            xor^=x;
        }
        return xor;
    }
    public static void main(String[] args) {
        int []arr={1,2,2,3,3};
        System.out.println(findSingleNumber(arr));
    }
}
