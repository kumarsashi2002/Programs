public class LinkedListBubbleSort {
    //Node head;
    class Node{
        int data;
        Node next;
    }
    public Node head=null;
    public Node tail=null;

    void addElement(int d){
        Node n1=new Node();
        n1.data=d;
        n1.next=null;
        
        if(head==null){
            head=n1;
            tail=n1;
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=n1;
            n1.next=null;
        }
    }


    void sortList(){
        Node n=head;
        System.out.println("After Sorting:");
        while(n.next!=null){
            Node index=n.next;
            while(index!=null){
                if(n.data>index.data){
                    int temp=n.data;
                    n.data=index.data;
                    index.data=temp;
                }
                index=index.next;
            }
            n=n.next;
        }
    }


    void display(){
        Node n=head;
        while(n.next!=null){
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String args[]){
        LinkedListBubbleSort ll=new LinkedListBubbleSort();
        ll.addElement(5);
        ll.addElement(2);
        ll.addElement(9);
        ll.addElement(32);
        ll.addElement(1);
        ll.display();
        ll.sortList();
        ll.display();
    }
}
