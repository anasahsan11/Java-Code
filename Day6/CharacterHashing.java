package Day6;

import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="ANASAHSAN";
        int hash[]=new int[26];
        //precomute
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hash[ch-'A']++;
        }

        //fetching
        System.out.println("Enter the number of query:");
        int q=sc.nextInt();

        while(q-->0){
            System.out.println("Enter the character to search for:");
            char ch=sc.next().charAt(0);
            System.out.println(ch +": "+ hash[ch-'A']);

        }

        sc.close();
    }
}
