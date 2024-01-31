public class LinkedListEx1{
	Node head;
	
	public class Node{
		int data;
		Node next;
	}
	
	public void addLast(int value){
		Node n1=new Node();
		n1.data=value;
		n1.next=null;
		if(head==null){
			head=n1;
		}else{
			Node n=head;
			while(n.next!=null){
				n=n.next;
			} 
			n.next=n1;
		}
	}
	
	public void addFirst(int value){
		Node n1=new Node();
		n1.data=value;
		if(head==null){
			head=n1;
		}else{
			Node n=head;
			n1.next=head;
			head=n1;
		}	
	}
	
	public void addAt(int pos, int value){
		Node n1 = new Node();
		n1.data=value;
		n1.next=null;
		if(pos==1){
			addFirst(value);
		}else{
			Node n=head;
			//System.out.println("Here n is:"+n.data);
			for(int i=1;i<pos-1;i++){
				n=n.next;
				//System.out.println("Here n is:"+n.data);
			}
			n1.next=n.next;
			n.next=n1;
			
		}
	}
	
	/*public void deleteLast(){
		if(head==null){
			head=head.next;
		}else{
			Node n=head;
			Node n2=null;
			while(n.next!=null){
				n=n.next;
			}
			//n.data=null;
			//n.next=null;			
		}
	}*/
	
	public void deleteAt(int pos){
		if(pos==1){
			head=head.next;
		}else{
			Node n=head;
            Node n2=null;
            for(int i=1;i<pos-1;i++){
                n=n.next;
            }
            n2=n.next;
            n.next=n2.next;
            n2=null;
		}
	}
	
	public void search(int value){
		boolean flag=false;
        Node n=head;
        while(n!=null){
            if(n.data==value){
                flag=true;
            }
            n=n.next;
        }
        if(flag){
            System.out.println(value+" is in the linked list:");
        }
        else{
            System.out.println(value+" is not in the list");
        }
	}
	
	public void show(){
		Node n=head;
		System.out.println("LinkedList Elements are:");
		while(n.next!=null){
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
	
	public static void main(String args[]){
		LinkedListEx1 ll=new LinkedListEx1();
		ll.addLast(15);
		ll.addFirst(10);
		ll.addLast(20);
		ll.addAt(3,11);
		//ll.deleteLast();
		ll.deleteAt(1);
		ll.search(15);
		
		ll.show();
	}
}