public class AlphabetsAToZ{
	public static void main(String args[]){
		/*int a=65,i;
		char b=(char) a;
		int c = b;
		for(i=65;i<91;i++){
			System.out.println(b);
			b++;
		}
		System.out.println(c);	*/
		recursiveMethod(5);		
	}
	static void recursiveMethod(int a){
		//int a=5;
			if(a<1){
				System.out.println("KSS");
			}else{
				recursiveMethod(a-1);
				System.out.println(a);
			}
	}
	
}