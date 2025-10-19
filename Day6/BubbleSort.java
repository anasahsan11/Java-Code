package Day6;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr={13,9,46,52,24,20};
        
        for(int i=arr.length-1;i>0;i--){   
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            } 
        }
//print the array
        for(int x:arr){
            System.out.println(x);
        }

    }
}
