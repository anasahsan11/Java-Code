package Day12;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeader {
    static ArrayList<Integer> leaders(int arr[]) {
        
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        ans.add(arr[n-1]);
        int maxEl=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxEl){
                ans.add(arr[i]);
                maxEl=arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
        
    }

    public static void main(String[] args) {
        int []arr={16,17,3,4,5,2};
        ArrayList<Integer>ans=leaders(arr);
        for(int x:ans){
            System.out.print(x+" ");
        }

    }
}
