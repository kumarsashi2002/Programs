public class FactorialRecursion{
	public static void main(String args[]){
		recursion(0);
		System.out.println(recursion(5));
	}
	public static int recursion(int n){
		if(n<0){
			return -1;
		}
		if(n==0 || n==1){
			return 1;
		}
		else{
			return (n*recursion(n-1));
		}
	}

}