/* ================        Single Inheritance  =======================*/

class A {
    int x=5,y=6;
    public void add(int x, int y){
        System.out.println("sum is: "+ (x+y));
    }
}

public class B extends A{
    public void subtract(int x, int y){
        System.out.println("Difference is : " + (x-y));
    }
    public static void main(String[] args) {
        B myObj=new B();
        myObj.add(9, 8);
        myObj.subtract(9, 8);
    }
}


/* =================     Hierarchical Inheritance  ==============================*/

// class A{
//     int x=5,y=6;
//     public void add(int x, int y){
//         System.out.println("Sum is: " + (x+y));
//     }
// }
// class B extends A{
//     public void subtract(int x, int y){
//         System.out.println("Difference is: " + (x-y));
//     }
//     public static void main(String args[]){
//         B obj1= new B();
//         obj1.add(9, 6);
//         obj1.subtract(9, 6);
//         C obj2 =new C();
//         obj2.add(2, 3);
//         obj2.multiply(2, 3);
//     }
// }
// class C extends A{
//     public void multiply(int x, int y){
//         System.out.println("Product is: " + (x*y));
//     }
// }

/* =================    Multilevel inheritance   =====================*/

// class A{
//     int x=5,y=6;
//     public void add(int x, int y){
//         System.out.println("Sum is: " + (x+y));
//     }
// }

// class C extends A{
//     public void subtract(int x, int y){
//         System.out.println("Difference is: " + (x-y));
//     }
// }

// class B extends C{
//     public void multiply(int x, int y){
//         System.out.println("Product is: " + (x*y));
//     }
//     public static void main(String args[]){
//         B obj = new B();
//         obj.add(9, 6);
//         obj.subtract(9, 6);
//         obj.multiply(9, 6);
//     }
// }


/* ============  Hybrid Inheritance =========================*/
// class A{
//     int x=5,y=6;
//     public void add(int x, int y){
//         System.out.println("Sum is: " + (x+y));
//     }
// }
// class C extends A{
//     public void subtract(int x, int y){
//         System.out.println("Difference is: " + (x-y));
//     }
// }
// class D extends A{
//     public void multiply(int x , int y){
//         System.out.println("Product is: " + (x*y));
//     }
// }
// class B extends C{
//     public void div(int x , int y){
//         System.out.println("Div is: " + (x/y));
//     }
//     public static void main(String args[]){
//         B obj1=new B();
//         C obj2=new C();
//         D obj3=new D();
//         obj1.add(9, 6);
//         obj1.subtract(9, 6);
//         obj2.subtract(9, 6);
//         obj3.multiply(9, 6);
//     }
// }
