#include<iostream>
using namespace std;
   
   /*------ Simple Program showing Method overriding ----*/   
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


   
//class Car{
//	private:
//		int gear[4];  
//	public:
//		void shiftGear(){
//			int i =1;
//			while(i<=4){
//				cout<<"Car is in Gear: "<<i<<endl;
//				i++;
//			}
//		}
//};
//class SportsCar: public Car{
//	private:
//		int gear[5];
//	public:
//		void gearChange(){
//			int i=1;
//			while(i<=5){
//				cout<<"SportsCar is in Gear: "<<i<<endl;
//				i++;
//			}
//		}
//};
//int main(){
//	Car c1;
//	SportsCar sc1;
//	sc1.gearChange();
//	sc1.shiftGear();  // This will apply brake as Car's brake which is different.
//}


   /* ----Showing important use of Method overriding-----*/
//class Car{
//	private:
//		int gear[4]; 
//	public:
//		int i=1;
//		void shiftGear(){
//			while(i<=4){
//				cout<<"Car is in Gear: "<<i<<endl;
//				i++;
//			}
//		}
//};
//class SportsCar: public Car{
//	private:
//		int gear[5];  
//	public:
//		void shiftGear(){
//			while(i<=5){
//				cout<<"SportsCar is in Gear: "<<i<<endl;
//				i++;
//			}
//		}
//};
//int main(){
//	Car c1;
//	SportsCar sc1;
//	sc1.shiftGear();
//	//c1.shiftGear();
//}



