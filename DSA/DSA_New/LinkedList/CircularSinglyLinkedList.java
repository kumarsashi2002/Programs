public class CircularSinglyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head , tail;
    public static int size;

    public void addFirst(int data){
        Node n1 = new Node(data);
        size++;
        if(head==null){
            head=tail=n1;
            return;
        }
        n1.next=head;
        head=n1;
        tail.next=head;
    }

    public void addLast(int data){
        Node n1= new Node(data);
        size++;
        if(head==null){
            head=tail=n1;
            return;
        }
        tail.next=n1;
        tail=n1;
        tail.next=head;
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("CLL is Empty!");
            return;
        }
        size--;
        head=head.next;
        tail.next=head;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("CLL is empty!");
            return;
        }
        size--;
        Node temp=head;
        for(int i=0;i<size-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;

    }

    public void print(){
        Node temp=head;
        while(temp.next!=head){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print(temp.data + "->");
        System.out.print(head.data + "\n");
    }

    public static void main(String args[]){
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.addFirst(1);
        csll.addFirst(2);
        csll.addFirst(3);
        csll.addFirst(4);
        csll.print();
        csll.removeFirst();
        csll.removeLast();
        System.out.println("Size of cll is: " + size);
        csll.print();

    }
}
