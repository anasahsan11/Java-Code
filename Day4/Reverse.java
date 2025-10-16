package Day4;

import java.util.Scanner;

public class Reverse {
    public static int reverseNumber(int n){
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to reverse:");
        int n=sc.nextInt();
        System.out.println("The reverse number is :"+ reverseNumber(n));
        sc.close();
    }
}
