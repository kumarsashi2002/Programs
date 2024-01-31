public class EPattern {
    public static void main(String args[]) {
        for (int i = 1; i <= 7; i++) {
            if (i % 3 - 1 == 0) {
                for (int j = 0; j <= 5; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }else{
                System.out.println("*");
            }
            
        }
    }
}
