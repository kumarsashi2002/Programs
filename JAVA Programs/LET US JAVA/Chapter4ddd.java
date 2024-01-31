import java.util.Scanner;

public class Chapter4ddd{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of a ,b and c:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>0 && b>0 && c>0){
			if(a!=b && b!=c){
				if(a<b && b<c)
				System.out.println("a is youngest.");
				else if(b<a && a<c)
				System.out.println("b is youngest.");
				else
				System.out.println("c is youngest.");
			}
			else if(a==b && a<c)
				System.out.println("a and b both have same age and Younger than c.");
			else if(c==a && a<b)
				System.out.println("a and c both have same age and Younger than b");
			else if(b==c && c<a)
				System.out.println("b and c both have same age and Younger than a.");
			else
				System.out.println("All are having the same age...");
		}
		else{
			System.out.println("Invalid age..");
		}	
	}
}