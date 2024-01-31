#include<iostream>
using namespace std;


//class complex{
//	private:
//		int a, b;
//	public:
//		void setData(int x,int y){
//			a=x; b=y;
//		}
//		void showData(){
//			cout<<"a="<<a<<" And b="<<b<<endl;
//		}
//		complex operator+(complex c){
//			complex temp;
//			temp.a=a+c.a;
//			temp.b=b+c.b;
//			return temp;
//		}
//};
//int main(){
//	complex c1,c2,c3;
//	c1.setData(3,4);
//	c2.setData(5,6);
//	//c3=c1.operator+(c2);
//	c3=c1+c2;
//	c3.showData();
//	return 0;
//}



//class complex{
//	private:
//		int a, b;
//	public:
//		void setData(int x, int y){
//			a=x;
//			b=y;
//		}
//		void showData(){
//			cout<<"a="<<a<<" And b="<<b<<endl;
//		}
//		complex operator-(){
//			complex temp;
//			temp.a=-a;
//			temp.b=-b;
//			return temp;
//		}
//};
//int main(){
//	complex c1,c2,c3,c4;
//	c1.setData(3,4);
//	c2.setData(5,-6);
//	c3=c1.operator-();
//	//c3=-c1;
//	//c4=c2.operator-();
//	c4=-c2;
//	c3.showData();
//	c4.showData();
//	return 0;
//}

class Integer{
	private:
		int a;
	public:
		void setData(int x){
			a=x;
		}
		void showData(){
			cout<<"a="<<a<<endl;
		}
//		Integer operator++(){
//			Integer i;
//			i.a=++a;
//			return i;		
//		}
		Integer operator++(int){
			Integer i;
			i.a=a++;
			return i;
		}
};
int main(){
	Integer c1,c2,c3;
	c1.setData(3);
//	c2=++c1;
//	c1.showData();
//	c2.showData();
	c2=c1++;
	c1.showData();
	c2.showData();
	return 0;
}



//class Kss{
//	private:
//		int a;
//	public:
//		void setData(int x){
//			a=x;
//		}
//		void showData(){
//			cout<<"a="<<a<<endl;
//		}
//		int operator++(){
//			Kss temp;
//			temp.a=++a;
//			return temp;		
//		}
////		int operator++(int){
////			int i;
////			i.a=a++;
////			return i;
////		}
//};
//int main(){
//	Kss c1,c2,c3;
//	c1.setData(3);
//	c1.showData();
//	c2=++c1;
//	c1.showData();
//	c2.showData();
////	return 0;
//}
