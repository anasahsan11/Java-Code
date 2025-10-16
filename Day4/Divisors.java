package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Divisors {
    public static void findDivisors(int n){
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                arr.add(i);
                if(n/i!=i) arr.add(n/i);
            }
        }

        Collections.sort(arr);
        System.out.println(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        findDivisors(n);
        sc.close();
    }
}
