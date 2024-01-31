public class If3 {
    public static void main(String[] args) {
        String s1=args[0];
        String s2=args[1];
        int len=args.length;
        if(len==0){
            System.out.println("No Values");
        }else{
            for(String val:args){
                System.out.print(val+",");
            }
        }
    }
}
