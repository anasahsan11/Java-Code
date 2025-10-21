package Day8;

public class SecondLargest {
    public static int secondLargest(int []arr){
        int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>l){
                sl=l;
                l=x;
            }
            if(x>sl && x!=l) sl=x;
        }
        return sl;
    }
    public static void main(String[] args) {
        int []arr={10,10,10,-1,-2};
        System.out.println(secondLargest(arr));
    }
}
