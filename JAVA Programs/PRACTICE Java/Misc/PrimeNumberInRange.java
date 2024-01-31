public class PrimeNumberInRange {
    public static void main(String args[]){
        int num=10;
        for(int i=0;i<=num;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n){
        int count=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }else {
            return false;
        }
    }
}
