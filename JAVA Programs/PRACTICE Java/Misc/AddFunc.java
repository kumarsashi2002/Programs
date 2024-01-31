/*class AddFunc{
	public int add(int i,int j){
		int k = i+j;
		return j;
	}
	
	public static void main(String [] args){
		AddFunc a1= new AddFunc();
		int m =a1.add(10,54);
		System.out.println("Result="+m);
		}
	}*/
	class AddFunc{
		public static void main(String args[]){
			int a=2, b=5, x=4;
			int c = a*++x +b;
			int d = a*x++ +b;
			
			System.out.println(c+"\n" +d);
			
		}
	}