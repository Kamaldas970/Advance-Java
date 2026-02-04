package Queue;
import java.util.*;
public class QueueReversal{
    public static void QueueReversal(Queue<Integer> q){
        Stack <Integer> s=new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String arg[]){
        Queue <Integer> q= new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        QueueReversal(q);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
        System.out.println();

    }
}