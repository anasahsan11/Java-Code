package Day4;
import java.util.Scanner;
public class CountDigits {
    public static int countDigits(int n){
        int cnt=0;
        while(n>0){
            cnt++;
            n/=10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to count digit:");
        int n=sc.nextInt();
        System.out.println("The number of digits:" + countDigits(n));
        sc.close();
    }
}
