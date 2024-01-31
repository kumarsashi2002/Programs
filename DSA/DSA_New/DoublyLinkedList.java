public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next, prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head , tail;
    public static int size;

    public void addFirst(int data){
        Node n1=new Node(data);
        if(head==null){
            head=tail=n1;
            return;
        }
        head.prev=n1;
        n1.next=head;
        head=n1;
    }

    public void addLast(int data){
        Node n1=new Node(data);
        if(head==null){
            head=tail=n1;
            return;
        }
        tail.next=n1;
        n1.prev=tail;
        tail=n1;
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("DLL is Empty!");
            return;
        }
        if(head.next==null){
            head=tail=null;
            return;
        }
        head=head.next;
        head.prev=null;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("DLL is Empty!");
            return;
        }
        if(head.next==null){
            head=tail=null;
            return;
        }
        tail=tail.prev;
        tail.next=null;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addLast(5);
        dll.removeFirst();
        dll.removeLast();
        dll.print();
    }
}
