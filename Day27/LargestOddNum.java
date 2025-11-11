package Day27;

public class LargestOddNum {
    public static String largestOddNum(String num){
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)%2==1) return num.substring(0,i+1);
        }
        return "";
    }
    public static void main(String[] args) {
        String num="4206";
        System.out.println(largestOddNum(num));
    }
}
