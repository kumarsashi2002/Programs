/*  ==========   Single Inheritance ========= */

class Shape{
    public void area(){
        System.out.println("It calcultes Area of a particular shape");
    }
}

public class Cicle extends Shape{

    public static void main(String[] args) {
        Inheritances obj1=new Inheritances();
        obj1.area();
        System.out.println();
    }
}


