public class MergeSortLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;

    public static void insert(int data){
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
        // tail=n1;
    }

    public static void print(){
        Node temp=head;
        if(head==null){
            System.out.println("Empty");
        }
        while(temp!=null){
            System.out.print(temp.data +"=>");
            temp=temp.next;
        }
        System.out.println("null");
    }

    static Node getMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node mid=getMiddle(head);
        Node rightHead=mid.next;
        mid.next=null;

        // System.out.println(head.data + ".." +rightHead.data);
        Node left=mergeSort(head);
        Node right=mergeSort(rightHead);

        return merge(left,right);
        // return head;
    }

    static Node merge(Node head1, Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;

        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                temp.next=head1;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
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
        return mergedLL.next;
    }

    public static void main(String[] args) {
        insert(0);
        insert(1);
        insert(2);
        insert(6);
        insert(4);
        insert(5);
        insert(3);
        print();

        mergeSort(head);
        print();
    }
}
