 import java.lang.*;
import java.util.*;
class PrimeNumber{
	public static void main(String arga[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean flag=true;
		if(num<=1){
			System.out.println(num + " is not a prime number");
			return;
		}
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println(num+ " is prime number");
		}else{
			System.out.println(num + " is not a prime number");
		}
































		// boolean flag = true;
		// int num = 3;
		// if(num < 2){
		// 	System.out.println("Not Prime");	
		// }else{
		// 	for(int i=2;i<=num/2;i++){
		// 		if(num%i == 0){
		// 			flag = false;
		// 			break;
		// 		}
		// 	}
		// 	if(flag){
		// 		System.out.println("Prime Number");
		// 	}else{
		// 		System.out.println("Not Prime");
		// 	}
		// }
	}
}



























































