package Day9;

public class LinearSearch {
    public static int linearSearch(int []arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int index=linearSearch(arr,7);
        System.out.println("The index of the key:"+ index);
    }
}
