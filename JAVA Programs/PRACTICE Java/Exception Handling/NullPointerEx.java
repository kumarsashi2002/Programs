public class NullPointerEx {
    public static void main(String[] args) {
        String s=null;
        System.out.println(s);
        try{
            char a=s.charAt(0);
            System.out.println("Character at 0 is: "+a);
        }catch(NullPointerException e){
            System.out.println("String S has null value");
        }
    }
}
