package Day12;

public class PosNeg {
    public static int[] rearrangeArray(int[] nums) {
      int pos=0,neg=1;
      int []ans=new int[nums.length];
      for(int x:nums){
        if(x>0){
            ans[pos]=x;
            pos+=2;
        }
        else{
            ans[neg]=x;
            neg+=2;
        }
      }
      return ans;
    }
    public static void main(String[] args) {
        int []arr={3,1,-2,-5,2,-4,-6,-7,9,8};
        int []ans=rearrangeArray(arr);
        for(int x:ans){
            System.out.print(x+" ");
        }

    }
}
