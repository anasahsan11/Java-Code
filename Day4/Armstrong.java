package Day4;

import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrong(int n){
        int k=String.valueOf(n).length();
        int sum=0,x=n;
        while(x>0){
            int d=x%10;
            sum+=Math.pow(d,k);
            x/=10;
        }
        if(sum==n) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int n=sc.nextInt();
        if(isArmstrong(n)) System.out.println(n +"is an armstrong number");
        else System.out.println(n +" is not an armstrong number");
        sc.close();
    }
}
