package Day8;

public class Largest {
    public static int largest(int []arr){
        int l=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>l) l=arr[i];
        }
        return l;
    }
    public static void main(String[] args) {
        int []arr={8,1,7,56,90};
        System.out.println(largest(arr));
        
    }
}
