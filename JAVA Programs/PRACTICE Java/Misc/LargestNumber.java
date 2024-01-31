import java.util.Scanner;
class LargestNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter three Numbers to compare-");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c){
			System.out.println(a+" is the Largest Number.");
		}
		else if(b>a && b>c){
			System.out.println(b+" is the Largest Number.");
		}
		else{
			System.out.println(c+" is the Largest Number.");
		}
		
	}
}