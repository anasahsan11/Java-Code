package Day5;
public class PrintName {
    
    public static void printName(int n){
        if(n==0) return ;
        System.out.println("Anas Ahsan");
        printName(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printName(n);
        
    }
}
