import java.util.Scanner;

class SumOfDigitsRec{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		System.out.println("Sum of digits is:" +sum(n));
	}
	static int sum(int n){ 
		if(n<0){
			n=n*-1;
		}
		if(n==0){
			return 0;
		}
		else{
			return (n%10)+sum(n/10);
		}
	}
}