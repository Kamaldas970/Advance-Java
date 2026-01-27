package LinkedList;
public class DoublyLinkedList{
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    void addFirst(int data){
        Node newNode=new Node(data);

      if(head==null){
        head=tail=newNode;
        return;
      }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;


    }

    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.println(temp.data + " "+ "==>");
            temp=temp.next;
        }
        System.out.println("null");
    }

    int removeFirst(){

        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
       else if(size==1){
            int value=head.data;
            head=tail=null;
            
        }

        int value=head.data;

        head=head.next;
        head.prev=null;
        return value;



    }

    public static void main(String args[]){
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        
        dll.removeFirst();
        dll.display();
        
    }

}