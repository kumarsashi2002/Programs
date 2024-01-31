#include<iostream>
using namespace std;


//class complex{
//	private:
//		int a,b;
//	public:
//		void set_data(int x, int y){
//			a=x; b=y;
//		}
//		void show_data(){
//			cout<<"a="<<a<<" And b="<<b<<endl;
//		}
//};
//int main(){
//	complex c1;
//	c1.set_data(3,4);
//	c1.show_data();
//}


    /*Declare function in class but define outside the class using member func. label(::).*/
//class complex{
//	private:
//		int a,b;
//	public:
//		void set_data(int x, int y);
//		void show_data();
//};
//void complex::set_data(int x, int y){
//	a=x; b=y;
//}
//void complex::show_data(){
//	cout<<"a="<<a<<" And b="<<b<<endl;
//}
//int main(){
//	complex c1;
//	c1.set_data(3,4);
//	c1.show_data();
//}

         	/* To add three complex numbers .*/
//class complex{
//	private:
//		int a ,b;
//	public:
//		void set_data(int x, int y){
//			a=x; b=y;
//		}
//		void show_data(){
//			cout<<"a="<<a<<" And b="<<b<<endl;
//		}
//		complex add(complex c){
//			complex temp;
//			temp.a=a+c.a;
//			temp.b=b+c.b;
//			return temp;
//		}
//};
//int main(){
//	complex c1,c2,c3,c4;
//	c1.set_data(3,4);
//	c2.set_data(5,6);
//	c3.set_data(100,100);
//	c4=c1.add(c2).add(c3);
//	c4.show_data();
//	return 0;
//}



//class Account{
//	private:
//		int balance;
//		static float r;
//	public:
//		void set_balance(int b){
//			balance=b;
//		}
//		void show_balance(){
//			cout<<"Balance="<<balance<<endl;
//		}
//};
//float Account::r=3.5f;
//int main(){
//	Account a1,a2;
//	a1.set_balance(2500);
//	a2.set_balance(5000);
//	a1.show_balance();
//	a2.show_balance();
//	return 0;
//}


class Account{
	private:
		int balance;
		static float roi;
	public:
		void setBalance(int b){
			balance=b;
		}
		void showBalance(){
			cout<<"Balance="<<balance<<endl;
			cout<<"Roi="<<roi<<endl;
		}
		static void setRoi(float r){
			roi=r+2;
		}
};
float Account::roi=3.5f;
int main(){
	Account a1,a2;
	a1.setBalance(2500);
	a2.setBalance(5000);
	a1.setRoi(6.2f);
	//Account::setRoi(4.5f);
	a1.setRoi(2.56);  //This will overrite 
	//a2.setRoi(9.9);
	a1.showBalance();
	a2.showBalance();
	
	return 0;
}





