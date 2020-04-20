
import java.util.*;
public class Collection {

     public static void main(String []args){
        
        Deque deq = new ArrayDeque<>();
		deq.add("btech1");
		deq.add("btech2");
		deq.add("btech3");
		deq.add("bca1");
		deq.add("bca2");
		deq.add("bca3");
		deq.add("mca1");
		deq.add("mca1");
		deq.add("mca1");
		System.out.println(deq);
		System.out.println(deq.peek());
}
}