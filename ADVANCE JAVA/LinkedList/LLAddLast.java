package practice;
public class LL{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public  int size;
void addLast(int data){

        Node newNode=new Node(data);
        size++;

        if(tail==null){
            head=tail=newNode;
            return ;
        }
       tail.next=newNode;
       tail=newNode;

    }
public void display(){
        Node temp=head;
        if(size==0){
            System.out.println("LL is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data + "=>");
            temp=temp.next;

        }
        System.out.println("null");

    }
    public static void main(String args[]){
        LL l=new LL();
        l.addLast(1);
         l.addLast(1);
         
           l.addFirst(7);
         
        
            l.display();
            System.out.println("Size is :"+ " " + l.size);
    }
}
