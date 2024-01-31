
public class ArrayOfStrings {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0]="Kumar";
        names[1]="Shekhar";
        names[2]="Gaurav";
        names[3]="Dutta";
        for(String val:names){
            System.out.println(val);
        } 
        for(int i=0;i<names.length;i++){
            System.out.println("Element at index "+i+" is: "+names[i]);
        }
    }
}
