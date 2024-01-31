public class Deloitte1 {
    public static void main(String[] args) {
        int x=50;
        int y=3;
        System.out.println(fun(x,y));
    }
    static int fun(int x, int y){
        int ans;
        if(x%y==0){
            return x;
        }
        int num=x*10;
        while(true){
            if(num%y==0){
                ans=num;
                break;
            }else{
                num++;
            }
        }
        return ans;
    }
}
