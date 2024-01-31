import java.util.Scanner;
class EvenOdd{
	public static void main(String srgs[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a;
		a=sc.nextInt();
		if(a%2==0)
			System.out.println(a +" is an Even Number");
		else
			System.out.println(a + " is an Odd Number");
		
	}
}