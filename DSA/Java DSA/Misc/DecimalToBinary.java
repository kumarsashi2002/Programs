import java.util.Scanner;

class DecimalToBinary{
	public static void main(String args[]){
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a>=1){
			int c=a%2;
			System.out.print(c);
			a=a/2;
		}
	}
}