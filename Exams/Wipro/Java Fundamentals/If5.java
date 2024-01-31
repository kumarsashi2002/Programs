import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char value=sc.next().charAt(0);
        int ascii=value;
        if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122)){
            System.out.println("Alphabet");
        }else if(ascii>=48 && ascii<=57){
            System.out.println("Digit");
        }else{
            System.out.println("Special Character");
        }
    }
}
