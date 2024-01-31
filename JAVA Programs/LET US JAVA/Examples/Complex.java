import java.util.Scanner;

class Complex{
	Scanner sc=new Scanner(System.in);
	private  float real,imag;
	//To get input as real and imaginary part of a Complex Number.
	public void getData(){
		float i,r;
		System.out.println("Enter real and imaginary part of a complex number:");
		r=sc.nextFloat();
		i=sc.nextFloat();
		real=r;
		imag=i;
	}
	//Set real and imaginary part by passing a and b through setData Method
	public void setData(float a, float b){
		real=a;
		imag=b;
	}
	//To display the Complex Number in terms of Real and imaginary part.
	public void displayData(){
		System.out.println("Real= "+real);
		System.out.println("Imaginary= "+imag);
	}
	
	public Complex addComplex(Complex y){
		Complex t=new Complex();
		t.real=real + y.real;
		t.imag=imag + y.imag;
		System.out.println("After Addition: ");
		return t;
	}
	public Complex mulComplex(Complex y){
		Complex t=new Complex();
		t.real=real*y.real - imag*y.imag;
		t.imag=real*y.imag + y.real*imag;
		System.out.println("After Multiplication: ");
		return t;
	}
	public static void main(String[] args){
		Complex c1,c2,c3;
		
		c1=new Complex();
		c1.setData(5,4);
		c2=new Complex();
		c1.getData();
		c2.getData();
		c3=new Complex();
		c3=c1.addComplex(c2);
		System.out.println("Complex c3: ");
		c3.displayData();
	}
}