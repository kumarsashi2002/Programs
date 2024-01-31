class PrimeFactorization{
	public static void main(String args[]){
		int mod,mod2;
		int i=2;
		int num=24;
		while(i<=num){
			mod=num%i;
			if(mod!=0){
				i++;
				mod2=num%i;
				if(mod2!=0){
					i++;
				}
				else{
					System.out.println(i);
					num=num/i;
				}
			}
			else{
				System.out.println(i);
				num=num/i;
			}
		}	
	}
}