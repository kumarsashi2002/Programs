public class PrimeNumber {
    public static void main(String[] args) {
        int n=3;
        int count=1;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Non Prime Number");
        }
    }

}
