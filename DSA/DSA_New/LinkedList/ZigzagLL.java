public class ZigzagLL {
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
        Node n1 =new Node(data);
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

    static Node getMiddlNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node nextNode=null;
        while(curr!=null){
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }

    static Node zigZag(Node head){
        // Find middle node
        Node mid=getMiddlNode(head);

        // reverse second half
        Node rightHead=reverse(mid.next);
        Node leftHead=head;
        mid.next=null;

        // merging both half in zigzag way
        while(leftHead!=null && rightHead!=null){
            Node nextLeft=leftHead.next;
            Node nextRight=rightHead.next;
            leftHead.next=rightHead;
            rightHead.next=nextLeft;
            leftHead=nextLeft;
            rightHead=nextRight;
        }
        return head;
    }

    public static void main(String[] args) {
        insert(0);
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        insert(6);
        print();
        zigZag(head);
        print();
    }



}
