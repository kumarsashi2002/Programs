public class Exam3 {
    static int SumOfDigits(int n){
        int sum=0;
        int n1=n;
        while(n1>0){
            int rem=n1%10;
            sum=sum+rem;
            n1=n1/10;
        }
        if(sum<=9){
            return sum;
        }else{
            return SumOfDigits(sum);
        }
    }

    public static void main(String args[]){
        Exam3 obj = new Exam3();
        int arr1[]={123456,1234567,536921};
        for(int i=0;i<arr1.length;i++){
            String ans="";
            int number1=arr1[i];
            //String num1=number1.toString();
            String num1=String.valueOf(number1);
            int len=num1.length();
            if(len==6){
                ans=ans+"C";
            }else{
                ans=ans+"W";
            }

            int n=arr1[i];
            if(n==0){
                ans=ans+"Z";
            }
            else if(n==1){
                ans=ans+"O";
            }else{
                boolean flag = true;
                if(n==2){
                    ans=ans+"P";
                }
                if(n < 2){
                    ans=ans+"N";
                }
                else{
                    for(int j=2;j<=n/2;j++){
                        if(n%j == 0){
                            flag = false;
                            break;
                        }
                    }
                    if(!flag){
                        ans=ans+"N";
                    }else{
                        ans=sns+"P";
                    }
                }
            }
                int sum1=SumOfDigits(n);
                ans=ans+sum1;

                if(n%2==0){
                    ans=ans+n/2;
                }else{
                    ans=ans+(n-1)/2;
                }

            System.out.println(ans);
        }
    }
}
