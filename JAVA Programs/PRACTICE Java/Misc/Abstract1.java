abstract class S1{
	abstract void m1();
	void m2(){
		System.out.println("M2 method");
	}
}
class Sub extends S1{
	void m1(){
		System.out.println("Overridden method");
	}
	void m3(int x, int y){
		System.out.println(x+y);
	}
}
class Abstract1{
	public static void main(String args[]){
		S1 obj1=new Sub();
		obj1.m1();
		obj1.m2();
		Sub obj2=new Sub();
		obj2.m1();
		obj2.m2();
		obj2.m3(5,4);
	}
}