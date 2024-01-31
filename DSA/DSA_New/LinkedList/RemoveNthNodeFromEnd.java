import java.util.LinkedList;

public class RemoveNthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head, tail;
    public static int size=0;
    
    public void add(int data){
        Node n1=new Node(data);
        if(head==null){
            head=tail=n1;
            return;
        }
        size++;
        tail.next=n1;
        tail=n1;
    }

    public void removeNode(int key){
        int index=size-key;
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;

    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        RemoveNthNodeFromEnd obj=new RemoveNthNodeFromEnd();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(6);
        obj.print();
        obj.removeNode(4);
        obj.print();
    }
}











// class RemoveNthNodeFromEnd{
//     public static void main(String args[]){
//         LinkedList <Integer> ll =new LinkedList<>();
//         ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         ll.add(4);
//         ll.add(5);
//         System.out.println(ll);
//         int key=3;
//         int indexToRemove = ll.size()-key;
//         int val=ll.remove(indexToRemove);
//         System.out.println(val + " is removed from ll");
//         System.out.println(ll);
//     }
// }








