class Details{
    public void country(){
        System.out.println("India");
    }
}

class Personal extends Details{
    public void country(){
        System.out.println("USA");
    }
}

public class MethodOverriding {
    // public void country(){
    //     System.out.println("USA");
    // }
    public static void main(String[] args) {
        //MethodOverriding obj=new MethodOverriding();
        Details obj2 = new Personal();
        obj2.country();
    }
}
