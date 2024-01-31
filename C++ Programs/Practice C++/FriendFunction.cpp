#include<iostream>
using namespace std;

    /* ---- SIMPLE FRIEND FUNCTION -----*/
//class Sum{
//	private:
//		int a,b;
//	public:
//		void setData(int x, int y){
//			a=x; b=y;
//		}
//		void showData(){
//			cout<<"a="<<a<<"And b="<<b<<endl;
//		}
//		friend void fun(Sum);
//};
//void fun(Sum c){
//	cout<<"sum is "<<c.a+c.b<<endl;
//}
//int main(){
//	Sum c1,c2,c3;
//	c1.setData(3,4);
//	fun(c1);
//}


      /* FRIEND FUNCTION IN MORE THAN ONE CLASS   */
//class B;
//class A{
//	private:
//		int a, b;
//	public:
//		void setData(int x){
//			a=x; 
//		}
//		void showData(){
//			cout<<"a="<<a<<endl;
//		}
//		friend void fun(A,B);
//};
//class B{
//	private:
//		int b;
//	public:
//		void setData(int y){
//			b=y;
//		}
//		void showData(){
//			cout<<"b="<<b<<endl;
//		}
//		friend void fun(A,B);
//};
//void fun(A o1,B o2){
//	cout<<"sum is "<<o1.a+o2.b<<endl;
//}
//int main(){
//	 A a1;
//	 B b1;
//	 a1.setData(2);
//	 b1.setData(3);
//	 fun(a1,b1);
//	 return 0;
//} 


        /*  OPERATOR OVERLOADING AS A FRIEND FUNCTION */
//class sum{
//	private:
//		int a,b;
//	public:
//		void setData(int x,int y){
//			a=x; b=y;
//		}
//		void showData(){
//			cout<<"a="<<a<<" And b="<<b<<endl;
//		}
//		friend sum operator+(sum , sum);
//};
//sum operator+(sum x, sum y){
//	sum temp;
//	temp.a=x.a+y.a;
//	temp.b=x.b+y.b;
//	return temp;
//}	
//int main(){
//	sum c1,c2,c3;
//	c1.setData(3,4);
//	c2.setData(5,6);
//	c3=c1+c2;
//    //c3=operator+(c1,c2);
//	c3.showData();
//	return 0;
//}


         /*-------OVERLOADING OF UNARY OPERATOR AS A FRIEND FUNCTION------*/
//class Complex{
//	private:
//		int a, b;
//	public:
//		void setData(int x, int y){
//			a=x;  b=y;
//		}
//		void showData(){
//			cout<<"a="<<a<<" And b="<<b<<endl;
//		}
//		friend Complex operator-(Complex);
//};
//Complex operator-(Complex x){
//	Complex temp;
//	temp.a=-x.a;
//	temp.b=-x.b;
//	return temp;
//}
//int main(){
//	Complex c1,c2,c3,c4;
//	c1.setData(3,-4);
//	c2.setData(-8,5);
//	c3=-c1;
//	c4=-c2;
//    c3=operator-(c1);
//	c3.showData();
//	c4.showData();
//	return 0;
//}


      /* -----OVERLOADING OF INSERTION OPERATOR AND EXTRACTION OPERATOR ------*/ 
class Complex{
	private:
		int a, b;
	public:
		void setData(int x , int y){
			a=x;  b=y;
		}
		void showData(){
			cout<<"a="<<a<<" And b="<<b<<endl;
		}
		friend ostream& operator<<(ostream &dout , Complex &c);
		friend istream& operator>>(istream &din, Complex &c); 
};
ostream& operator<<(ostream &dout, Complex &c){
	dout<<"a="<<c.a<<" b="<<c.b<<endl;
	return dout;
}
istream& operator>>(istream &din, Complex &c){
	cin>>c.a>>c.b;
	return din;
}
int main(){
	Complex c1,c2;
	cout<<"Enter c1"<<endl;
	cin>>c1;
	cout<<"Entered "<<c1;
	//c1.setData(3,4);
	//c1.showData();
	return 0;
}


    /*-------- ACCESS ALL FUNCTIONS OF CLASS A IN B AS A FRIEND FUNCTION -----*/ 
				//class A {
				//	private:
				//		int a,b;
				//	public:
				//		void setData(int x,int y){
				//			a=x; b=y;
				//		}
				//		void showData(){
				//			cout<<"a="<<a<<" And b="<<b<<endl;
				//		}
				//};
				//class B  {
				//	friend class A;
				//	//friend void A::setData();
				//};
				//int main(){
				//	A a1,a2,a3;
				//	B b1,b2,b3;
				//	a1.setData(3,4);
				//	a1.showData();
				//	b1.setData(10,20);
				//	b1.showData();
				//	return 0;
				//}




