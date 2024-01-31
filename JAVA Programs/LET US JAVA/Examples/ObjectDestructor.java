class Example{
	private int i;
	public Example(){
		System.out.println("Inside the Constructor:");
	}
	protected void finalize() throws Throwable{
		super.finalize();
	}
}
public class ObjectDestructor{
	public static void main(String args[]){
		Example e=new Example();
	}
}


//  Not Completed........................