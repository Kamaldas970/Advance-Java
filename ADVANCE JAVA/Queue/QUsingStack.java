package practice;
import java.util.*;
public class QUSingStack{
     static Queue<Integer> q=new LinkedList<>();
       static Stack<Integer> s1= new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
           while(!q.isEmpty()){
           s1.push(q.remove());
           }
            s1.push(data);
        }
    public static void main(String args[]){
        q.add(2);
        q.add(4);
        q.add(3);
        q.add(1);
        while(!q.isEmpty()){
            System.out.print(q.remove()+ " ");
        }
        System.out.println();

       
      
        while(!s1.isEmpty()){
            
            System.out.print(s1.pop()+ " ");
            
           
        }
         
        System.out.println();
       
        
    }
}