interface I{
	void m1();
	void m2();
	
}
class Sub implements I{
	public void m1(){
		System.out.println("Overrided method m1");
	}
	public void m2(){
		int a=5 ,b=4;
		System.out.println(a+b);
	}
	
}
class Interface1{
	public static void main(String args[]){
		I obj1=new Sub();
		obj1.m1();
		obj1.m2();
		
		
	}
}