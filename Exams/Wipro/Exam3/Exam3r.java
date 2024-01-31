public class Exam3r {
    public static void main(String[] args){
        int t = find_tvalue(1,2,1);
        System.out.println(t);
    }

    public static int find_tvalue(int input1, int input2, int input3){
        int t = 1;
        if(isPrime(input2) && input2 % 2 == 0){
            t = input1*input1*(sumOfNPrimes(input2));
        }else if(isPrime(input2) && input2 % 2 != 0){
            t = input2*input2*(sumOfNPrimes(input3));
        }else if(!isPrime(input2) && input2 %2 == 0 && input2 >= 4){
            t = input3*input3*(sumOfNPrimes((input2+input3)));
        }else if(!isPrime(input2) && input2 %2 != 0 && input2 >= 4){
            t = input3*input3*(sumOfNPrimes((input1+input2+input3)));
        }

        if(isPrime(t)){
            return t+input3;
        }else{
            return t-input3;
        }
    }



    static boolean isPrime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                count = count + 1;
                if(count > 2){
                    return false;
                }
            }
        }
        return true;
    }

    static int sumOfNPrimes(int n){
        int count = 0;
        int i=2;
        int sum = 0;
        while(count != n){
            if(isPrime(i)){

                sum = sum + i;
                count = count + 1;
            }
            i = i + 1;
        }
        return sum;
    }
}
