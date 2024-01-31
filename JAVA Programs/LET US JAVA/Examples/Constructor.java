class Number{
	private int a;
	public int displayData(int x, int y){
		int z=x+y;
		System.out.println("displayData Method called:");
		System.out.println("The value of Sum is: "+z);
		return z;
	}
	public Number(){
		System.out.println("Zero argument Constructor called:");
	}
	public Number(int i){
		a=i;
		System.out.println("One Argument Constructor called:");
		System.out.println("Value of a is: " +a);
	}
	public Number(int x, int y){
		int z=x+y;
		System.out.println("Two Argument Constructor called:");
		System.out.println("Sum is: "+z);		
	}
}

class Constructor{
	public static void main(String args[]){
		Number obj=new Number(5,4);
		obj.displayData(5,4);
		
	}
}