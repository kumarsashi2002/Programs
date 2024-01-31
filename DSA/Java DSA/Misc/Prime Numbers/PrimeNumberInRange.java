public class PrimeNumberInRange {
    public static void main(String[] args) {
        int n=25;
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    // Method to check whether the number is Prime Number or not
    static boolean isPrime(int n){
        int count=1;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
    }
}
