import java.util.Scanner;

class Stack_ex{
    static int top,size;
	int[] arr = new int[size];
	
	Stack_ex(){
		top=-1;
	}
	
	void push(int value){
		if(top==size-1){
			System.out.println("Stack is Full");
		}
		else{
			top++;
			arr[top]=value;
			System.out.println("Inserted:"+value);
		}
	}
	void pop(){
		if(top==-1){
			System.out.println("Empty Stack");
		}
		else{
			System.out.println(arr[top] +" Popped out");
			top--;
		System.out.println("____"+arr[top]+" "+ arr[top++]);
		}
	}
	void display(){
		if(top==-1){
			System.out.println("Empty stack");
		}
		else{
			System.out.println("Elements in Stack are:");
			for(int i=0;i<=top;i++){
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		Stack_ex obj=new Stack_ex();
		obj.push(5);
		obj.push(10);
		obj.push(26);
		obj.push(29);
		obj.pop();
		obj.display();
	}
}
