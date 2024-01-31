public class Palindrome {
    public static void main(String args[]){
        int num=122;
        int n=num;
        int x;
        int rev=0;
        while(n>0){
            x=n%10;
            rev=rev*10+x;
            n=n/10;
        }
        if(rev==num){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
