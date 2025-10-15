// import java.util.ArrayList;
// import java.util.Iterator;

//import java.util.Stack;

// import java.util.LinkedList;
// import java.util.Queue;

// import java.util.PriorityQueue;
// import java.util.Queue;

// import java.util.ArrayDeque;

// import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.Set;
// import java.util.TreeSet;

import java.util.HashMap;
import java.util.Map;

public class CollectionsFramework {
    public static void main(String[] args) {
        /* 
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10); //to add an element in an array
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        
        arr.add(1,25); //to add elem at specific index
        System.out.println(arr.get(2)); // to access element at index
        arr.remove(2); //to remove element from index
        
        
        System.out.println(arr); //to print arr
        System.out.println(arr.contains(60)); //to check whether it contains given elem or not returns boolean value


        //ways to traverse array
        for(int i=0;i<arr.size();i++){    
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for(Integer elem:arr){
            System.out.print(elem+" ");
        }
        System.out.println();
        //Iterator
        Iterator<Integer>it=arr.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
]
    

        //stack-LIFO
        Stack<Integer>st=new Stack<>();
        st.push(1); //to push an elem in stack
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        System.out.println(st.peek());//to find the top elem of stack
        st.pop();
        System.out.println(st);

        
        // Queue-FIFO
        Queue<Integer>q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);
        System.out.println(q);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q);
        

        //priority queue
        //smallest elem-max priority
        Queue<Integer>pq=new PriorityQueue<>();
        Queue<Integer>pq=new PriorityQueue<>(Comaprator.reverseOrder());
        pq.offer(50);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());

        ArrayDeque<Integer>adq=new ArrayDeque<>();
        adq.offer(10);
        adq.offerFirst(5);
        adq.offerLast(15);
        adq.offer(25);

        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println("Removed elem:"+ adq.poll());
        System.out.println("Removed first elem:"+ adq.pollFirst());
        System.out.println("Removed last elem:"+ adq.pollLast());

        

        Set<Integer>set=new HashSet<>(); //stores unique values in unordered not even the order we enter
        Set<Integer>set2=new LinkedHashSet<>(); //stores unqiue val in order we enter
        Set<Integer>set3=new TreeSet<>(); // stores unique val in sorted order
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(4);
        set.add(5);
        System.out.println(set);
        System.out.println(set.contains(3));
        System.out.println(set.size());
        System.out.println(set.isEmpty());
*/
        HashMap<String,Integer>map=new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        for(Map.Entry<String,Integer>e:map.entrySet()){
            //System.out.println(e);
            //System.out.println(e.getKey());
            //System.out.println(e.getValue());   
        }

        for(String key:map.keySet()){
            //System.out.println(key);
        }

        for(Integer val:map.values()){
            System.out.println(val);
        }




    }
}
