import java.util.Scanner;
class PositiveNegative{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number.");
		int a=sc.nextInt();
		if(a>0)
			System.out.println(a +" is a Positive Number");
		else if(a<0)
			System.out.println(a +" is a Negative Number"); 
		else	
			System.out.println(a +" is neither positive nor Negative.");
		
	}
}