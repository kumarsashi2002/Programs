import java.util.Scanner;

public class Chapter2c{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks obtained:");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int sst = sc.nextInt();
		int gk = sc.nextInt();
		int english = sc.nextInt();
		
		int total_marks = (math+science+sst+gk+english);
		float percentage_marks = total_marks/5f;
		System.out.println("Aggregate Marks: "+total_marks);
		System.out.println("Percentage Marks: "+percentage_marks);
	}
}
