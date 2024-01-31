public class RevserseOfLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    static void insert(int data){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n1;
    }
    static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "=>");
            temp=temp.next;
        }
        System.out.println("null");
    }
    static Node reverse(){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        head=prev;
        return head;
    }

    public static void main(String[] args) {
        insert(0); 
        insert(1); 
        insert(2); 
        insert(3);
        print();
        System.out.println(head.data );
        reverse();
        print();
        System.out.println(head.data );
    }

    
}
