import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number-");
		int num=sc.nextInt();
		int i;
		int ans=1;
		for(i=1;i<=num;i++){
			ans=ans*i;
		}
		System.out.println(ans);
		
	}
}