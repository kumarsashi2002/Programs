class Course{
	String cname;
	double fees;
	public Course(String cname,double fees)
	this.cname = cname;
	this.fees = fees;
	}
	public void display(){
		System.out.println("Course name:" +this.cname);
		System.out.println("Course fees:" +this.fees);
		
		}
	class Student extends Course{
		String sname,email;
		public Student(String sname,String email,String cname, double fees){
			super(cname.fees);
			this.sname = sname;
			this.email = email;
			
		}
		 public void studentDetails(){
		  System.out.println("Student name:"+ this.sname);
		  System.out.println("Student email:" + this.email);
		  }
		  
		 class College{
		   public static void main(String [] args){
				Student s= new Student("Raj","raj@gmail.com","python", "3000");
				s.studentDetails();
				s.display();
				} 