import java.util.Scanner;
class Fibonacci{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int c;
		int a=0,b=1;
		
		System.out.println("Fibonacci series till num is:"+"\n"+a+"\n"+b);
		int count=2;
		// while(count<num){
		// 	c=a+b;
		// 	a=b;
		// 	b=c;
		// 	System.out.print(c+"\n");
		// 	count++;              
		// }
		
		// int i=0;
		// while(i<=num){
		// 	c=a+b;
		// 	a=b;
		// 	b=c;
		// 	System.out.println(c);
		// 	i++;
		// }
		
		for(int i=0;i<=num;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}