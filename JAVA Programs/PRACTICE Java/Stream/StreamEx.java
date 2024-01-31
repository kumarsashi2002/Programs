import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,4,3,2,7,6,8,5));
        ArrayList<String> al2 = new ArrayList<>(Arrays.asList("Ram", "Shyam", "Mohan", "Sohan", "Sheela"));
        // al.stream().filter(n->n%2==1).map(n->n*2).filter(n->n%2==0).map(n->n*3).forEach(n->System.out.println(n));
        Stream <Integer> st1=al.stream();
        //st1.filter(n-> n%2==1).map(n->n*2+1);
        // //st1.forEach(n->System.out.println(n));  /* one stream object can't be reused */
        long total=al.stream().count();
        System.out.println("total length of al is: " + total);
        //long count = al.stream().peek(System.out::println).count();

        // al.stream()
        //   .filter(n->n%2==0)
        //   .sorted()
        //   .map(n->n*n)
        //   .forEach(n->System.out.println(n));

        
        Predicate<Integer> predi=new Predicate<Integer>() {
            @Override
            public boolean test(Integer n){
                if(n%2==1){
                    return true;
                }
                else{
                    return false;
                }
            }
        };


        // Predicate<Integer> predi2 = new Predicate<Integer>(){
        //     @Override
        //     public boolean test(Integer n){
        //         return n%2==0;
        //     }
        // };

        // Predicate <Integer> predi2=(Integer n)->n%2==0;
        // Predicate <Integer> predi2= (n)-> n%2==0;
        // Predicate <Integer> predi2= n->n%2==0;

        // al.stream().filter(predi2).forEach(n->System.out.println(n));

        ArrayList<Integer> al4=al.stream().filter(n->n%2==0).collect(Collectors.toList());



        Stream<String> st2 =al2.stream();
        //al2.stream().filter(n->n.length()==6).forEach(n->System.out.println(n));
        al2.stream().filter(n->n.equals("Sohan")).forEach(n->System.out.println(n));
        al2.stream().filter(n->n.toLowerCase()=="Sheela").forEach(n->System.out.println(n));



    }
}
