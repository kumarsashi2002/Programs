public class LinkedListEx {
    Node head;

    public class Node{
        int data;
        Node next;
    }

    public void insert(int d){
        Node n1=new Node();
        n1.data=d;
        n1.next=null;

        if(head==null){
            head=n1;  //Make newly inserted node as Head node
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=n1;  //Assign address of the newly inserted node to the previous node
        }
    }


    void insertAtStart(int d){
        Node n1=new Node();
        n1.data=d;
        n1.next=head;    // Assign address of current head in the new node n1
        head=n1;         // Assign address of n1 to the head
    }

    void insertAt(int index,int d){
        Node n1=new Node();
        n1.data=d;
        if(index==0){
            insertAtStart(d);
        }
        else{
            Node n=head;
            for(int i=0;i<index-1;i++){
                //System.out.println("KSS");
                n=n.next;

            }
            n1.next=n.next;   //Assign address of the next node to the newly inserted node
            n.next=n1;        //Assign address of the newly inserted node to the last one node(index-1)
        }
    }

    void deleteAt(int index){
        if(index==0){
            head=head.next;
        }
        else{
            Node n=head;
            Node n2=null;
            for(int i=1;i<index-1;i++){
                n=n.next;
            }
            n2=n.next;
            n.next=n2.next;
            n2=null;
        }
    }

    public int search(int d){
        boolean flag=false;
        Node n=head;
        int i=0;
        while(n!=null){
            if(n.data==d){
                System.out.println(n.data+" is in the linked list:");
                flag=true;
                return i;
            }
            n=n.next;
        }
        System.out.println(d+" is not in the linked list:");
        return -1;
        // if(flag){
        //     System.out.println(d+" is in the linked list:");
        // }
        // else{
        //     System.out.println(d+" is not in the list");
        // }
    }

    public void reverse(){
        Node n = head; 
        Node previous = null, 
        current = null;
        while (n.next != null) {
            current = n; 
            n = n.next;
            // reverse the link 
            current.next = previous; 
            previous = current; 
            head = current;
        }
    }

    public void show(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data + "->");
            n=n.next;
        }
        System.out.println(""); 
    }

    public static void main(String args[]){
        LinkedListEx ll=new LinkedListEx();
        ll.insert(10);
        ll.insert(12);
        ll.insert(15);
        ll.insert(8);
        ll.insert(26);
        ll.show();
        // ll.insertAtStart(101);
        // ll.insertAt(2,500);
        ll.deleteAt(3);
        //ll.reverse();
        ll.show();
        int ans=ll.search(4);
        System.out.println(ans);
    }
}
