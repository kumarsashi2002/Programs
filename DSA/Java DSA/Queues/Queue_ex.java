import java.util.Scanner;

class Queue_ex{
	static int front, rear,size;
	int[] arr=new int[size];
	
	
	Queue_ex(){
		rear=front=-1;
	}
	
	void push(int value){
		if(rear==size-1 && front==0){
			System.out.println("Queue is full");
		}
		else{
			front=0;
			rear++;
			arr[rear]=value;
			System.out.println("Inserted :"+value);
		}
	}
	void pop(){
		if(front==-1){
			System.out.println("Queue is Empty");
		}
		else{
			if(front>=rear){
				front=rear=-1;
			}
			System.out.println("Popped out:"+arr[front]);
			front++;
		}
	}
	void display(){
		if(front==-1){
			System.out.println("Queue is empty:");
		}
		else{
			for(int i=0;i<rear;i++){
				System.out.println("Elements are:"+arr[i]);
			}
		}
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array:");
		size=sc.nextInt();
		Queue_ex obj=new Queue_ex();
		obj.push(2);
		obj.push(5);
		obj.push(6);
		obj.push(7);
		obj.push(9);
		obj.pop();
		obj.pop();
		obj.push(25);
		obj.display();
	}
}