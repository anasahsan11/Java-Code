package Day5;

public class Print1toN {
    static int cnt=1;
    public static void printNum(int n){
        if(n==0) return;
        System.out.println(cnt++);
        printNum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printNum(n);
    }
}
