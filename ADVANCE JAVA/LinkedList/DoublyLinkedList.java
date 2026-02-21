package practice;
public class doubleLL{

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public  void addFisrst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }
    public  void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(tail==null){
            head=tail=newNode;
        }
       tail.next=newNode;
       newNode.prev=tail;
       tail=newNode;
    }
    public static void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data + " ==>");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

    public  void addMid(int data, int idx){
        Node newNode=new Node(data);
        size++;
        Node temp=head;

        if(idx==0){
            addFisrst(data);
            return;
        }

        if(head==null){
            head=tail=newNode;
            return;
        }
        int i=0;
        while(i<idx-1 && temp!=null){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
       newNode.prev=temp;
       temp.next=newNode;

       if(temp.next!=null){
        temp.next.prev=newNode;
        
       }

    }
    public static void main(String args[]){
        doubleLL ll=new doubleLL();
        ll.addFisrst(1);
        ll.addFisrst(2);
        ll.addLast(5);
        ll.addLast(7);
        ll.addMid(3,2);
        ll.addMid(2,3);
        ll.display();
        System.out.println("the size is : "+" "+ ll.size);


    }
}
