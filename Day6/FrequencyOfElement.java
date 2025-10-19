package Day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FrequencyOfElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arr");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x, 0)+1);
        }
        int maxFreqElem=0,minFreqElem=0;
        int maxFreq=0,minFreq=n;
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            int cnt=e.getValue();
            int elem=e.getKey();
            if(cnt>maxFreq){
                maxFreq=cnt;
                maxFreqElem=elem;
            }
            if(cnt<minFreq){
                minFreq=cnt;
                minFreqElem=elem;
            }
        }
        System.out.println("The max freq elem:" + maxFreqElem);
        System.out.println("The min freq elem:" + minFreqElem);
        sc.close();
    }
}
