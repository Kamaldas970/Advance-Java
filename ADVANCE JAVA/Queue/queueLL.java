package Queue;
public class queueLL{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean isEmpty(){
        return head==null;
    }

    public static void add(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head.next=newNode;
        head=newNode;
    }
    public static int remove(){

       if(size==0){
        System.out.println("isempyty")
        return Integer.MIN_VALUE;
       }

       else if(size==1){
        int value=head.data;
        head=tail=null;
        return value;
       }
        int value=head.data;
        head.next=head;
        return value;
        



    }



    public static void main(String args[]){

    }
}