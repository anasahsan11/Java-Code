package Day5;

public class ReverseString {
    static boolean palindrome(String s,int i){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return palindrome(s,i+1);
        
    }
    public static void main(String[] args) {
        String str="mam";
        if(palindrome(str,0)) System.out.println("yes");
        else System.out.println("No");

    }
}
