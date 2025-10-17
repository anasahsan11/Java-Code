package Day5;

public class PrintSum {
    
    static void printSum(int i,int sum){

        if(i<1){
            System.out.println(sum);
            return;
        }
        
        printSum(i-1,sum+i);
    }
    public static void main(String[] args) {
        int n=7;
        printSum(n,0);
    }
}
