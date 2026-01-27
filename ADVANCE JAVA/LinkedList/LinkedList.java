package LinkedList;
public class Linked{
    class Node{
        int data;
        Node next;

       
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String arg[]){
        LinkedList ll=new LinkedList();
        ll.head=new node(1);
        ll.head.next=new node(2);

    }
}