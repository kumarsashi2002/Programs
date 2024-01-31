import java.util.Scanner;
public class ExamKss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();

        ArrayList <Integer> al1 = new ArrayList<>();
        ArrayList <Integer> al2 = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            al1.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            al2.add(sc.nextInt());
        }

        System.out.println(al1);
        System.out.println(al2);
    }
}
