package Day6;

import java.util.Scanner;

public class CharacterHashing2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="Anas Ahsan";
        int []hash=new int[256];
        //prestoring
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }

        //fetching
        System.out.println("Enter the number of queries");
        int q=sc.nextInt();
        while (q-->0) {
            System.out.print("Enter the key to search for:");
            char ch=sc.next().charAt(0);
            System.out.println(hash[ch]);
        }
        sc.close();
    }
}
