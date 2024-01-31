import java.util.Scanner;
import java.io.*;
class Exception1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers to Divide:");
		
		//int i=5;
		//int j=0;
		
		while(true){
			try{
				int i=sc.nextInt();
				int j=sc.nextInt();
				int k=i/j;
				System.out.println(k);
			}
			catch(IOException e){
					System.out.println("Invalid");
			}
			catch(NumberFormatException e){
					System.out.println("Invalid");
			}
		}	
		
	}
}