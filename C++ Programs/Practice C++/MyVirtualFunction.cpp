#include<iostream>
using namespace std;

/*-----  Limitation of Method Overriding in case of Pointer objects---*/
//class A{
//	public:
//		void fun(){
//			cout<<"fun of A:"<<endl;
//		}
//};
//class B: public A{
//	public:
//		void fun(){
//			cout<<"fun of B:"<<endl;
//		}
//};
//int main(){
//	A *p , a1;
//	B b1;
//	p=&b1;
//	b1.fun();
//	p->fun();  // Here fun of A is called. But we wanted to call fun of B (as p=&b1) 	
//}



  /*---- Use of Virtual function to overcome Limitation of Method Overriding---*/
//class A{
//	public:
//		virtual void fun(){
//			cout<<"fun of A:"<<endl;
//		}
//};
//class B:public A{
//	public:
//		void fun(){
//			cout<<"fun of B:"<<endl;
//		}
//};
//int main(){
//	A a1, *p;
//	B b1;
//	p=&b1;
//	p->fun();
//}




class A{
	public:
		void f1(){
			cout<<"f1 of A:"<<endl;
		}
		virtual void f2(){
			cout<<"f2 of A:"<<endl;
		}
		virtual void f3(){
			cout<<"f3 of A:"<<endl;
		}
		virtual void f4(){
			cout<<"f4 of A:"<<endl;
		}
};
class B: public A{
	public:
		void f1(){
			cout<<"f1 of B:"<<endl;
		}
		void f2(){
			cout<<"f2 of B:"<<endl;
		}
		void f4(int x){
			cout<<"f4 of B:"<<endl;
		}
};
int main(){
//	A *p , a1;
//	p=&a1;
//	p->f1();
//	p->f2();
//	p->f3();
//	p->f4();
//	//p->f4(5);  //  ERROR. bcz It will call f1() in A which has no arguments.
	
	
	A *p;  B b1;  
	p=&b1;
	p->f1();
	p->f2();
	p->f3();
	p->f4();
	//p->f4(5);  // ERROR. 
}
