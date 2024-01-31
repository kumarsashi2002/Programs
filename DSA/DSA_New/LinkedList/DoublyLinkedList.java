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

    public Node reverse(Node head){
        Node prevNode=null;
        Node curr=head;
        while(curr!=null){
            Node nextNode=curr.next;
            
            curr.next=prevNode;
            curr.prev=nextNode;
            prevNode=curr;
            curr=nextNode;
        }
        head=prevNode;
        return prevNode;
    }

    public void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        // dll.removeFirst();
        // dll.removeLast();
        dll.print(head);
        Node newHead=dll.reverse(head);
        dll.print(newHead);
    }
}
