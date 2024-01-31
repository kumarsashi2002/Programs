class MethodOverloading{
    public int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        MethodOverloading obj=new MethodOverloading();
        int ans=sum(2,5,8);

        System.out.println("Sum is "+ans);
    }
}