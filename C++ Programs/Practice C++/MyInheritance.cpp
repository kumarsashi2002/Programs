#include<iostream>
using namespace std;

//class A{
//	private:
//		int a,b;
//	protected:
//		void setData(int x, int y){
//			a=x; b=y;
//		}
//		void showData(){
//			cout<<"value of a="<<a<<" And b= "<<b<<endl;
//		}	
//	public:
//		void showThis(){
//			cout<<"KSS DUTTA:::: "<<endl;
//		}
//};
//class B:public A{
//	public:
//		void add(int x, int y){
//			setData(3,4);
//			showData();
//		}
//};
//int main(){
//	A a1;
//	B b1;
//	b1.add(3,4);
//	//a1.setData();  ERROR . bcz setData is protected
//	b1.showThis();
//}


     /*----- Showing use of private as visibility mode------*/
					class Array{
						private:
							int a[10];
						public:
							void insert(int index, int value){
								int i=0;
								while(i<10){
									a[i]=value;	
									i++;
								}
								a[index]=value;
								cout<<"Index="<<a[i]<<" And value="<<value<<endl;
							}
					};
					class Stack:private Array{
						private:
							int top;
						public:
							void push(int value){
								insert(top,value);
							}
							
					};
					int main(){
						Stack s1;
						s1.push(85);
						s1.push(78);
						s1.push(256);
						//s1.insert(0,24);    // ERRORR cannot accessible
					}




