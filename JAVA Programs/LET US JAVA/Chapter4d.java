import java.util.Scanner;

public class Chapter4d{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of Ram Shyam and Ajay:");
		int age_Ram = sc.nextInt();
		int age_Shyam = sc.nextInt();
		int age_Ajay = sc.nextInt();
		if(age_Ram>0 && age_Shyam>0 && age_Ajay>0){
			if(age_Ram!=age_Shyam && age_Shyam!=age_Ajay){
				if(age_Ram<age_Shyam && age_Shyam<age_Ajay)
				System.out.println("Ram is youngest.");
				else if(age_Shyam<age_Ram && age_Ram<age_Ajay)
				System.out.println("Shyam is youngest.");
				else
				System.out.println("Ajay is youngest.");
			}
			
			else if(age_Ram==age_Shyam && age_Ram<age_Ajay)
				System.out.println("Ram and Shyam have same age and Younger.");
			else if(age_Ajay==age_Ram && age_Ram<age_Shyam)
				System.out.println("Ram and Ajay have same age and Younger");
			else if(age_Shyam==age_Ajay && age_Ajay<age_Ram)
				System.out.println("Shyam and Ajay have same age and Younger.");
			else
				System.out.println("All are having the same age...");
		}
		else{
			System.out.println("Invalid age..");
		}	
	}
}