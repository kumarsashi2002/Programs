#include<iostream>
using namespace std;


//class A{
//	public :
//		A(){
//			cout<<"A's Constructor"<<endl;
//		}
//};
//class B:public A{
//	public:
//		B():A(){
//			cout<<"B's constructor"<<endl;
//		}
//};
//int main(){
//	//A a1;
//	B b1;	
//}



//class A{
//	private:
//		int a;
//	public:
//		A(int x){
//			a=x;
//			cout<<"a="<<x<<endl;
//		}
//};
//class B: public A{
//	public:
//		B():A(5){
//			cout<<"B's Constructor"<<endl;
//		}
//};
//int main(){
//	//A a1(5);
//	B b1;
//}


class A{
	private:
		int a;
	public:
		A(int x){
			a=x;
			cout<<"A: "<<" a="<<x<<endl;
		}
};
class B:public A{
	private:
		int b , c;
	public:
		B(int x, int y):A(5){
			b=x;  c=y;
			cout<<"B:"<<" a="<<x<<" And b="<<y<<endl;
		}
};
int main(){
	A a1(5);
	B b1(6,7);
}


//class A{
//	public:
//		~A(){
//			cout<<"A's Destructor"<<endl;
//		}
//};
//class B: public A{
//	public:
//		~B():A(){
//			cout<<"B's Destructor"<<endl;
//		}
//};
//int main(){
//	A a1;
//	B b1;
//}

