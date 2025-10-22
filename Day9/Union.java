package Day9;

import java.util.ArrayList;



public class Union {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer>union=new ArrayList<>();
        int i=0,j=0;
        int n=a.length,m=b.length;
        while(i<n && j<m){
            if(a[i]<=b[j]){
                if(union.size()==0 || union.get(union.size()-1)!=a[i]) union.add(a[i]);
                i++;
                
            }
            else{
                if(union.size()==0 || union.get(union.size()-1)!=b[j]) union.add(b[j]);
                j++;
            }
        }
        
        while(i<n){
            if(union.size()==0 || union.get(union.size()-1)!=a[i]) union.add(a[i]);
            i++;
            
        }
        
        while(j<m){
            if(union.size()==0 || union.get(union.size()-1)!=b[j]) union.add(b[j]);
            j++;
            
        }
        
        return union;
    }
    public static void main(String[] args) {
        int []a={1,2,3,3,3,4,4};
        int []b={1,2,3,4,5,8,9};
        ArrayList<Integer>union=findUnion(a, b);
        for(int x:union){
            System.out.print(x+" ");
        }
    }
}
