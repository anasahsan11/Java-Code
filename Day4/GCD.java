package Day4;

import java.util.Scanner;

public class GCD {
    public static int findGCD(int a,int b){
        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) return b;
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println("The GCD of two num is:"+ findGCD(a,b));
        sc.close();
    }
}
