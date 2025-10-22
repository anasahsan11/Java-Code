package Day9;

public class MaxOnes {
    public static int findMaxConsecutiveOnes(int []arr){
        int cnt=0,maxi=0;
        for(int x:arr){
            if(x==1) cnt++;
            else cnt=0;
            maxi=Math.max(maxi,cnt);
        }
        return maxi;
    }
    public static void main(String[] args) {
        //int []arr={1,1,1,0,0,1,0,1,1,1,1,1,0};
        int []arr={1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
