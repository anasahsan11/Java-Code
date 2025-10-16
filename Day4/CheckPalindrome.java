package Day4;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean isPalindrome(int n){
        int rev=0,x=n;
        while(x>0){
            int d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        if(rev==n) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int n=sc.nextInt();
        if (isPalindrome(n)) System.out.println(n +" is a palindrome ");
        else System.out.println(n+" is not a palindrome");
        sc.close();
    }
}
