import java.util.Scanner;
public class FirstP{
   public static void main(String[] args) {
	   int a = 9;
	   int b = 4;
	   float c = 12.9f;
	   String nameOf = "GAURAV DUTTA:";
          //System.out.println("KSS DUTTA :"+"\n"+a+"\n"+b+"\n"+c+"\n"+nameOf);
		Scanner scan = new Scanner(System.in);
		int e = scan.nextInt();  
		//System.out.println("The Entered number is :" + e);
		scan.close();
		int f = a+b;
		int g = a*b;
		int h = a/b;
	    int k = a%b;
		//System.out.println("Arithmetic operations :"+"\n"+f+"\n"+g+"\n"+h +"\n"+ i);
		
		/*if (a>b){
		System.out.println("a is greater");}
		
		else if (a==b){
			System.out.println("a and b are same");
		}
		else{
		System.out.println("b is greater");}*/
		
		
		int a2=(int)c;    // It converts float to int (Narrowing)
		float a1= a;    // It convets int to float (Widening)
		//System.out.println(a1);
		
		
		int i = 1;
		while (i < 5){
			int j = i*i;
		//System.out.println("kss:" + i +","+ j + ","+(i*i));
		i++;}
		
		for (i=1;i<=5;i++){
			System.out.println("Gaurav: " + i);
		}
		
		
		
		
			
		
		
		
		
		
		
}
}