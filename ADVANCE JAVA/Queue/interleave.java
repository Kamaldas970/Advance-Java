package Queue;
import java.util.*;
public class interleave{

    public static void inter(Queue<Integer>q){
         Queue<Integer> FirstHalve=new LinkedList<>();

         int size=q.size();

         for(int i=0;i<size/2;i++){
            FirstHalve.add(q.remove());
         }

         while(!FirstHalve.isEmpty()){
            q.add(FirstHalve.remove());
            q.add(q.remove());
         }
    }
    public static void main(String arg[]){
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        inter(q);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}