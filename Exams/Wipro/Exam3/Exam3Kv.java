public class Exam3Kv {
    public static String userId(String input1,String input2, int input3, int input4) {
		String ans="";
		int len1=input1.length();
		int len2=input2.length();
		
		if(len1>len2) {
			char c=input1.charAt(0);
			ans=ans+c;
			ans=ans+input2;
		}else if(len1==len2) {
			char ch1=input1.charAt(0);
			char ch2=input2.charAt(0);
			int a1=ch1;
			int a2=ch2;
			if(a1>a2) {
				char c=input1.charAt(0);
				ans=ans+c;
				ans=ans+input2;
			}else {
				char c=input2.charAt(0);
				ans=ans+c;
				ans=ans+input1;
			}
		}else {
			char c=input2.charAt(0);
			ans=ans+c;
			ans=ans+input1;
		}
		
		String s1=String.valueOf(input3);
		char c1='a';
		for(int i=0;i<input4;i++) {
			c1=s1.charAt(i);
		}
		ans=ans+c1;
		
		char c2='a';
		for(int i=s1.length()-1;i>s1.length()-input4-1;i--) {
			c2=s1.charAt(i);
		}
		ans=ans+c2;
		
        String output=ans.substring(0,2).toLowerCase()+ans.substring(2);
		return output;
	}
	
	public static void main(String[] args) {
		String input1="Rajiv";
		String input2="Roy";
		int input3=560037;
		int input4=6;
		String ans1=userId(input1,input2,input3,input4);
		System.out.println(ans1);
	}
}
