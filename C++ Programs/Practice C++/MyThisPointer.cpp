#include<iostream>
using namespace std;

//class Box{
//	private:
//		int l,b,h;
//	public:
//		void setDimension(int x, int y, int z){
//			l=x;   b=y;   h=z;
//		}
//		void showDimension(){
//			cout<<"l="<<l<<" b="<<b<<" h="<<h<<endl;
//		}
//};
//int main(){
//	Box b1;
//	b1.setDimension(5,6,7);
//	b1.showDimension();
//}



//class Box{
//	private:
//		int l,b,h;
//	public:
//		void setDimension(int x, int y, int z){
//			l=x;   b=y;   h=z;
//		}
//		void showDimension(){
//			cout<<"l="<<l<<" b="<<b<<" h="<<h<<endl;
//		}
//};
//int main(){
//	Box *p, b1;
//	p=&b1;
//	p->setDimension(5,6,7);
//	p->showDimension();
//	//p.setDimension(5,6,7);  //ERROR , p is object pointer
//}



class Box{
	private:
		int l,b,h;
	public:
		void setDimension(int l, int b, int h){
			this->l=l;   
			this->b=b;    
			this->h=h;
		}
		void showDimension(){
			cout<<"l="<<l<<" b="<<b<<" h="<<h<<endl;
		}
};
int main(){
	Box b1;
	b1.setDimension(5,6,7);
	b1.showDimension();
}
