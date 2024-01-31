class PowerOfNumberRec{
	public static void main(String args[]){
		System.out.println(power(6,2));
	}
	static int power(int base, int exp){
		if(exp<0){
			return -1;
		}
		else{
			if(exp==1){
				return base;
			}
			if(exp==0){
				return 0;
			}
			else{
				return base*power(base,exp-1);
			}
		}
	}
}