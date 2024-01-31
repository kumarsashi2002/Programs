import java.util.Scanner;

/*public class Chapter3b{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		for(i=0;i)
	}
}*/
public class Chapter3b{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>=b && a>=c){
			System.out.println("a is older");
			if(b>=c)
				System.out.println("c is youn");
			else
				System.out.println("b is youn");
		}
		else if(b>=a && b>=c){
			System.out.println("b is older");
			if(a>=c)
				System.out.println("c is young");
			else
				System.out.println("a is young");
		}
		else if(c>=a && c>=b){
			System.out.println("c is older");
			if(a>=b)
				System.out.println("b is young");
			else
				System.out.println("a is young");
			}
		}
	}
