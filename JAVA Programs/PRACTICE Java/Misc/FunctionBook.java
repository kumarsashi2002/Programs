public class FunctionBook{
	public static void main(String [] args){
		int a = 5;
		int b = 8;
		int c =add(a,b);
		add(a,b);
		school_name myObj = new school_name();
		myObj.school_name();
		System.out.println("KSS DUTTA!,"+a+c+myObj);
		
		/*school_name();*/
		
	}
	static int add(int x , int y){
		int z = x+y;
		return z;
	}
	public void school_name(){
		System.out.println("Gaurav DuttaJi");
		int a=9;
		System.out.println("here a="+a);
	}
}