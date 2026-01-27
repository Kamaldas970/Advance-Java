package LinkedList;
public class MergeSort{
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    void addFirst(int data){
        Node newNode=new Node(data);
       

        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public  void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data + " " + "-->");
            temp=temp.data;
        }
        System.out.println("null");

    }

    public Node getMid(int head){
        Node fast=head.next;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public Node merge(int head1, int head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;

        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;

            }else{
            temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }

        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
         while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
    }
    public Node mergesort(int head){

        if(head==null && head.next!=null){
            return head;
        }

        Node mid=getMid(head);

        Node righthead=mid.next;
        mid.next=null;

        Node newleft=mergesort(head);
        Node newright=mergesort(righthead);

        return merge(newleft, newright);

    }
    public static void main(String args[]){
        MergeSort nn=new MergeSort();
        nn.addFirst(5);
        nn.addFirst(4);
        nn.addFirst(3);
        nn.addFirst(2);
        nn.addFirst(1);
        System.out.println(nn.display());
       
        System.out.println(nn.mergesort());

    }
}