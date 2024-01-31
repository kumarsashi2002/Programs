import java.util.Scanner;

//      ------FIRST METHOD-----
/*public class Chapter2b{
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	double m = a*1000f;
	double feet = a*3280.83f; 
	double inch = a*39370.07f;
	double cm = a*100000f;
	public static void main(String[] args){
		Chapter2 obj = new Chapter2();
		System.out.println("Distance in metre:"+m.obj);
		System.out.println("Distance in feet:"+feet.obj);
		System.out.println("Distance in inch:"+inch.obj);
		System.out.println("Distance in centimetre:"+cm.obj);
	}
}*/	
	

//       -------SECOND METHOD-------	
	public class Chapter2b{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Distance in KMs:");
			int a = sc.nextInt();
			double m = a*1000f;
			double feet = a*3280.83f; 
			double inch = a*39370.07f;
			double cm = a*100000f;
			System.out.println("Distance in metre:"+m);
			System.out.println("Distance in feet:"+feet);
			System.out.println("Distance in inch:"+inch);
			System.out.println("Distance in centimetre:"+cm);
	}
}