import java.util.Arrays;
import java.util.Scanner;

public class BubleSortString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        String [] names=new String[size];
        for(int i=0;i<size;i++){
            names[i]=sc.nextLine();
        }
        //Arrays.sort(names);

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(names[i].compareTo(names[j])>0){
                    String temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }

        for(String val:names){
            System.out.println(val);
        }
    }
}
