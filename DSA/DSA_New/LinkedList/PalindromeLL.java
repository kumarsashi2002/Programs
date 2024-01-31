public class PalindromeLL {
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

    public static void insert(int data){
        Node n1 = new Node(data);
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

    public static void print(){
        Node temp=head;
        if(head==null){
            System.out.println("Empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data +"=>");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static Node reverse(){
        Node prev=null;
        Node curr=head;
        
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next=prev;

            prev=curr;
            curr=nextNode;
        }
        head=prev;
        return head;
    }

    /* Method to find middle of linked list */
    public static Node middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    /* Method to check palindrome */
    public static boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node mid = middle(head);
        
        Node prev=null;
        Node curr=mid;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }

        Node rightHead=prev;
        Node left=head;
        while(rightHead!=null ){
            if(left.data!=rightHead.data){
                return false;
            }
            left=left.next;
            rightHead=rightHead.next;
        }
        return true;
    }

    public static void main(String args[]){
        insert(1);
        insert(2);
        insert(3);
        insert(2);
        insert(1);
        print();
        boolean ans=isPalindrome();
        System.out.println(ans);
        print();
    }
}
