import java.util.Scanner;

/*public class Chapter2e{
	public Scanner sc = new Scanner(System.in);
	public double rectangle(){
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		double ar_rect = l*b;
		double peri_rect = 2*(l+b);
		return (ar_rect);
		 
	}
	public double circle(double r){
		r = sc.nextDouble();
		double ar_circle = 3.14*r*r;
		double cf_circle = 2*3.14*r;
		return (ar_circle);
		return (cf_circle);
	}
	public static void main(String [] args){
		Chapter2e obj = new Chapter2e();
		//rectangle rec = new rectangle();
		//circle cir = new circle();
		double rectangle = obj.rectangle(5,4);
		double ar_circle = obj.circle(4);
		//obj.rectangle(4,5);
		//obj.circle(4);
		System.out.println(ar_rect);
		System.out.println(ar_circle);
		System.out.println(peri_rect);
		System.out.println(cf_circle);
	}
}*/



public class Chapter2e{
	public Scanner sc = new Scanner(System.in);
	public double[] rectangle(){
		System.out.println("Enter the length & Breadth of Rectangle:");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		double[] result = new double[2];
		result[0]= 2*(l+b);
		result[1]= l*b;
		return result;
	}
	public double[] circle(){
		System.out.println("Enter the radius of circle:");
		double r = sc.nextDouble();
		double[] result2 = new double[2];
		result2[0]= 2*3.14*r;
		result2[1]= 3.14*r*r;
		return result2;
	}
	public static void main(String [] args){
		Chapter2e obj = new Chapter2e();
		double result[] = obj.rectangle();
		System.out.println("perimeter ="+result[0] + "Area ="+result[1]);
		double result2[] = obj.circle();
		System.out.println("Circumference="+result2[0]+"Area="+result[1]);
	}
	
}














/*class Chapter2e{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		double radius = sc.nextDouble();
		double area_rect = length*breadth;
		double perimeter_rect = 2*(length+breadth);
		double area_circle = 3.14*radius*radius;
		double circumference_circle = 2*3.14*radius;
		System.out.println(area_circle+"\n"+circumference_circle);
		System.out.println(area_rect+"\n"+perimeter_rect);
		}
}*/