public class LinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node n1=new Node(data);
        size++;
        if(head==null){
            head=tail=n1;
            return;
        }
        n1.next=head;
        head=n1;
    }

    /* Add at last using tail node . Time - Linear O(1) */
    public void addLast(int data){  
        Node n1=new Node(data);
        if(head==null){
            // addFirst(data);
            head=tail=n1;
            return;
        }
        size++;
        tail.next=n1;
        tail=n1;
    }

    /* Add a last using head node . Time- Constatnt O(n) */
    public void addLastUsingHead(int data){  
        Node n1=new Node(data);
        size++;
        Node temp=head;
        if(head==null){
            head=n1;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n1;
    }

    public void addAt(int data, int idx){
        if(head==null || idx==1){
            addFirst(data);
        }
        Node n1=new Node(data);
        size++;
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        n1.next=temp.next;
        temp.next=n1;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("LL is Empty!");
            return;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            System.out.println(val + " is deleted ");
            return;
        }
        size--;
        int val=head.data;
        head=head.next;
        System.out.println(val+ " is deleted");
    }

    public void deleteAt(int idx){
        if(idx==0){
            head=head.next;
        }
        Node temp=head;
        Node t=null;
        for(int i=0;i<idx-2;i++){
            temp=temp.next;
        }
        int val=temp.next.data;
        t=temp.next;
        temp.next=t.next;
        t=null;
        System.out.println(val + " is deleted");
    }

    public void deleteLast(){
        int val=tail.data;
        if(head==null){
            System.out.println("LL is empty!");
            return;
        }
        Node temp=head;
        size--;
        for(int i=0;i<size-1;i++){
            temp=temp.next;
        }
        Node t=null;
        temp.next=t;
        tail=temp;
        System.out.println(val + " is deleted");
    }

    public int search(int d){
        Node n=head;
        int i=0;
        while(n!=null){
            if(n.data==d){
                System.out.println(n.data+" is in the linked list:");
                return i;
            }
            n=n.next;
        }
        System.out.println(d+" is not in the linked list:");
        return -1;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int sizeOfLL(){
        Node temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        // System.out.println(length);
        return length;
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addLast(3);
        // ll.addLastUsingHead(4);
        // ll.addAt(9, 2);
        ll.display();
        ll.deleteFirst(); 
        // ll.deleteLast();
        // ll.display();
        // ll.deleteAt(1);
        ll.search(1);
        ll.display();
        
        // System.out.println(ll.sizeOfLL());
        System.out.println("Size of ll is: " + size);
    }
}
