public class ArithmeticExceptionEx {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            int c=a/b;
            System.out.println("C is:"+c);
        }
        catch(ArithmeticException e){
            System.out.println("Undefined Value");
        }
    }
}
