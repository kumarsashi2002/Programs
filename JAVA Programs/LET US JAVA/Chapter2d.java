import java.util.Scanner;

public class Chapter2d{
	public static void main(String[] args){
		System.out.println("Enter Temp. in Fahrenheit");
		Scanner sc = new Scanner(System.in);
		float fahrenheit = sc.nextFloat();
		float celcius = (fahrenheit-32)*5/9f;
		System.out.println("Temperature in Celcius is :"+celcius);
		System.out.println("Temperature in Fahrenheit is :"+fahrenheit);
	}
}