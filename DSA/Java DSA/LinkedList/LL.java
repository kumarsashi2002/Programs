public class LL {
    Varsha head;
	
	public class Varsha{
		int data;
		Varsha next;
	}
	
	public void addLast(int value){
		Varsha n1=new Varsha();
		n1.data=value;
		n1.next=null;
		if(head==null){
			head=n1;
		}else{
			Varsha n=head;
			while(n.next!=null){
				n=n.next;
			} 
			n.next=n1;
		}
	}
    public void show(){
		Varsha n=head;
		System.out.println("LinkedList Elements are:");
		while(n.next!=null){
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}

    public static void main(String args[]){
		LL ll1=new LL();
		ll1.addLast(15);
        ll1.addLast(16);
        ll1.addLast(17);
        ll1.addLast(18);
        ll1.show();
    }
}
