public class CircularDoublyLinkedList {
    public static class Node{
        int data;
        Node next , prev;
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
        size++;
        if(head==null){
            head=tail=n1;
            return;
        }
        head.prev=n1;
        n1.next=head;
        n1.prev=tail;
        head=n1;
    }

    public void addLast(int data){
        Node n1=new Node(data);
        size++;
        if(head==null){
            head=tail=n1;
            return;
        }
        tail.next=n1;
        n1.prev=tail;
        n1.next=head;
        tail=n1;
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("CLL is empty!");
            return;
        }
        size--;
        head=head.next;
        tail.next=head;
        head.prev=tail;
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
        tail=temp;
        head.prev=tail;
    }

    public void print(){
        Node temp=head;
        while(temp.next!=head){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }

        // Node t2=head;
        // for(int i=0;i<size;i++){
        //     System.out.print(t2.data + "->");
        //     t2=t2.next;
        // }
        System.out.print(head.data + "\n");
    }

    public static void main(String args[]){
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.addFirst(1);
        cdll.addFirst(2);
        cdll.addFirst(3);
        cdll.addFirst(4);
        cdll.addLast(5);
        cdll.print();
        cdll.removeFirst();
        cdll.print();
        cdll.removeLast();
        cdll.print();

        System.out.println("Size of CLL is: " + size);
    }
}
