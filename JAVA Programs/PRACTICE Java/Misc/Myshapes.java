 abstract class Shape{
	 
	public abstract void area();
	}
	class Rectangle extends Shape{
		double l,b;
		public Rectangle(int a, int b){
		this.l = a;
		this.b = b;
		
		}
		public void area(){
			System.out.println("Ar of rectangle:"+(l*b));
		}
	}
	class Myshapes{
		public static void main(String [] args){
		Rectangle r1 = new Rectangle(2,3);
        r1.area();
		Square s1 = new Square(4);
		s1.area();
		//Shape ss = new Shape();
		Shape ss;		
			

		}
	}
	
	
	
	