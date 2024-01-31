class A{
	public:
		void f1(){
			cout<<"f1 of A"<<endl;
		}
		void f2(){
			cout<<"f2 of B"<<endl;
		}
};
class B: public A{
	public:
		void f1(){
			cout<<"f1 of B"<<endl;
		}
		void f2(int x){
			cout<<"f2 of B"<<" And x="<<x<<endl;
		}
};
int main(){
	A a1;
	B b1;
	b1.f1();
	b1.f2(5);
	//b1.f2();   // ERROR
}