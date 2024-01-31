public class StringIndexOutOfBoundsEx {
    public static void main(String[] args) {
        String s="Gaurav";
        try{
            char a= s.charAt(9);
            System.out.println("character at index 9 is:"+a);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("As we cannot access given index in s. This arises String Index out of bounds Exception");
        }
    }
}
