package LinkedList;
public class print{
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
    public static int size;

    void addFirst(int data){
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    
    void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(tail==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
         tail=newNode;
    }

    public  void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data + " " + "-->");
            temp=temp.data;
        }
        System.out.println("null");

    }
    void addMid(int idx, int data){
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=head.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty"+ " ");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
           int value=head.data;
            head=tail=null;
            size=0;
            return value;
        }

        int value=head.data;
        head=head.next;
        size--;
        return value;
    }
public int removeLast(){
        if(size==0){
            System.out.println("ll is empty"+ " ");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
           int value=head.data;
            head=tail=null;
            size=0;
            return value;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int value=prev.next.data;
        prev.next=null;
        prev=tail;
        size--;
        return value;
    }
    public int itrSearch(int key){
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
       return -1;
    }
    

    

    public static void main(String args[]){
        print n=new print();
        n.addFirst(2);
        

        n.addFirst(1);
       

        n.addLast(4);
        

        n.addLast(5);
       
        
        n.addMid(3,3);
        
        n.removeFirst();
        n.removeLast();
        
n.display();
System.out.println(n.itrSearch(4));
        System.out.println(n.size);
        

    }
}