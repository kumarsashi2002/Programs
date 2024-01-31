import java.util.Scanner;
class ReverseOfNumber{
	public static void main(String args[]){
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter a Number:");
		// int a=sc.nextInt();
		int a=123;
		int n=a;
		int x;
		int rev=0;
		while(n>0){
			x=n%10;
			rev=rev*10+x;
			n=n/10;
		}
		System.out.println("Reverse of "+ a +" is: " +rev);
	}
}