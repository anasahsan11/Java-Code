package Day6;

import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("Enter the array elements:");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int []hash=new int[13];

        //precompute
        for(int x:arr){
            hash[x]++;
        }

        System.out.println("Enter the number of queries");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("Enter the key to search for:");
            int key=sc.nextInt();
            System.out.println("The number of occurences of key:"+ hash[key]);
        }
        sc.close();
    }
}
