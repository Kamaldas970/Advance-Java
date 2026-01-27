package LinkedList;
public class detectCycle{
   static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;

    public boolean detect(){
        Node fast=head;
        Node slow=head;
        while(fast!=null &&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public void remove(){
        //to detect

        Node fast=head;
        Node slow=head;
        boolean cycle=false;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast){
                cycle=true;
                break;
            }
        }
            if(cycle==false){
                return ;
            }
            //met point

            
           Node prev=null;
            while(slow!=fast){
                

                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }

            prev.next=null;

        
    }

    public static void main(String args[]){
        detectCycle ll=new detectCycle();
         head=new Node(1);
         
        head.next=new Node(2);
        Node temp=new Node(2);
        head.next.next=temp;
        head.next.next.next=temp;
        System.out.println(ll.detect());
       ll.remove();
       System.out.println(ll.detect());
        


    }
}