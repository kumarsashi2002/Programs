#include<iostream>
using namespace std;

class Stack{
    public:
        int top,size;
		cout<<"Enter the size of array:"<<endl;
		cin>>size;
		int arr[]=new int[size];
		Stack(){
			top=-1;
		}
		void push(int x){
			if(top==size-1){
				cout<<"Stack is Already full"<<endl;
			}
			else{
				top++;
				arr[top]=x;
				cout<<x<<" is Inserted into the stack"<<endl;
			}
		}
		int pop{
			if(top==-1){
				cout<<"Stack is Empty"<<endl;
			}
			else{
				cout<<arr[top]<<" is deleted from the stack"<<endl;
				top--;
				cout<<"Now top element is:"<<arr[top]<<endl;
			}
		}
		void display{
			if(top==-1){
				cout<<"Stack is empty"<<endl;
			}
			else{
				for(int i=0;i<size;i++){
					cout<<arr[i]<<endl;
				}
			}
		}

};

int main() {
    cout<<"KSS";
	Stack s1;
	s1.push(5);
	s1.push(6);
	s1.push(7);
	s1.push(8);
	s1.push(9);
	s1.push(15);
	s1.pop();
	s1.display();
	
    return 0;
}
