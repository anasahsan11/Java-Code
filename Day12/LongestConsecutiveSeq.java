package Day12;

import java.util.HashSet;

public class LongestConsecutiveSeq {
    public static int longestConsecutive(int[] arr) {
        // code here
        if(arr.length==0) return 0;
        int longest=1;
        HashSet<Integer>st=new HashSet<>();
        for(int val:arr){
            st.add(val);
        }
        
        for(int val:arr){
            if(!st.contains(val-1)){
                int cnt=1,x=val;
                while(st.contains(x+1)){
                    x++;
                    cnt++;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int []arr={2, 6, 1, 9, 4, 5, 3};
        System.out.println(longestConsecutive(arr));
    }
}
