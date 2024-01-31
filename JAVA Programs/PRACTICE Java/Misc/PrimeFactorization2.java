import java.lang.*;
import java.util.Scanner;

class PrimeFactorization2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		while(num != 1){
			for(int i = 2;i<=num;i++){
				if(num%i==0){
					System.out.println(i);
					num = num/i;
					break;
				}
			}
		}
	}
}