import java.util.Scanner;

/*public class Chapter3a{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of C and D");
		int C = sc.nextInt();
		int D = sc.nextInt();
		int a;
		a=C;
		C=D;
		D=a;
		System.out.println("After swapping:\nC="+C+"\n"+"D="+D);
	}
}*/

public class Chapter3a{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int D = sc.nextInt();
		C=C+D;
		D=C-D;   // a=a+b:  b=a-b:  a=a-b
		C=C-D;
		System.out.println("After Swapping:\nC="+C+"\nD="+D);
	}
}