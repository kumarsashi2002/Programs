public class Classes2 {
    public class Calculator{
        static int powerInt(int num1, int num2){
            int pow1=Math.pow(num1,num2);
            return pow1;
        }
        static double powerDouble(double num1, double num2){
            double pow2=Math.pow(num1,num2);
            return pow2;
        }
        public static void main(String args[]){
            //Calculator c1=new Calculator();
            powerInt(2,4);
            powerDouble(6,2);
        }
    }
}
