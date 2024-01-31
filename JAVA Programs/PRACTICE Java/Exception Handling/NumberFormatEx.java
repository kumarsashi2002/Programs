public class NumberFormatEx {
    public static void main(String[] args) {
        try{
            int a=Integer.parseInt("KSS");
            String s=5;
            System.out.println(a);
        }catch(NumberFormatException e){
            System.out.println("It cannot be converted into a number: Number Format Exception");
        }
    }
}
