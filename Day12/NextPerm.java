package Day12;

public class NextPerm {
    public static void reverse(int []arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void nextPermutation(int[] arr) {
        int n=arr.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(arr,0,n-1);
            return;
        }
        for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                break;
            }
        }  
        reverse(arr,index+1,n-1);
    }

    public static void main(String[] args) {
        int []arr={3,2,1};
        nextPermutation(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
        
    }
}
