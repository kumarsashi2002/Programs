import java.util.Scanner;
class Swapping1{
	public static void main(String args[]){
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter two Numbers:");
		// a=sc.nextInt();
		// b=sc.nextInt();
		int a=5;
		int b=6;
		a=a+b;
		b=a-b;
		a=a-b;
		//b=a+b-(a=b);
		System.out.println("After Swapping:"+"\n"+a+ "\n" +b);
	}
}