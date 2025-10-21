package Day8;

public class RemoveDuplicates {
    public static int removeDuplicates(int []arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int []arr={1,1,2,2,2,3,3,3,4,4,4,4};
        int n=removeDuplicates(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
