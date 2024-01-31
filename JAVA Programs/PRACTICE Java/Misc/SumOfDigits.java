import java.util.Scanner;
class SumOfDigits{
	public static void main(String args[]){
		// Scanner sc =new Scanner(System.in);
		// System.out.println("Enter a Number:");
		// int a=sc.nextInt();
		int a=136;
		int n=a;
		int rem;
		int sum=0;
		while(n>0){
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of Digits of " + a +" is:" +sum);
	}
}