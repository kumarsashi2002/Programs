import java.util.Scanner;

class GcdRec{
	public static int gcd(int a, int b){
		if(a<0 || b<0){
			return -1;
		}
		if(a==0 || b==0){
			return a;
		}
		else{
			return gcd(b,a%b);
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		GcdRec obj=new GcdRec();
		System.out.println(obj.gcd(a,b));
	}
}