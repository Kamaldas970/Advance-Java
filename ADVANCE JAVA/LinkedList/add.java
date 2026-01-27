package LinkedList;
public class add{

    public class Node{
        int data;
        Node next;

        Node data(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;
    
   public void add(int data){
Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        
        newNode.next=head;

        head=newNode;
    }
public void last(int data){
    Node newNode=new Node(data);

    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;
}

public void print(int data){
if(head==null){
    system.out.println("ll is empty");
    return;
}
    Node temp=head;
    while(temp!=null){

    system.out.println(temp.data);
    temp=temp.next;
    }
    system.out.println();

}

    public static void main(String arg[]){

    LinkedList ll=new LinkedList();
    ll.add(1);
    ll.add(2);
    ll.last(4);
    ll.last(5);
    }

    
}