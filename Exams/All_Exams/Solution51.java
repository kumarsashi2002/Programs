public class Solution51 {
    public static String reverse(String str){
        StringBuilder input1 = new StringBuilder();
        input1.append(str);
        input1.reverse();
        return String.valueOf(input1);
    }
    public static String calculate(String N){
        String res = N;
        int d = 0;
        while(d != N.length()-2){
            d = d+1;
            res = reverse(res.substring(0,N.length()-d)) + res.substring(N.length()-d);
        }
        return res;
    }

    public static void main(String[] args){
        String str = "3456070";
        System.out.println(calculate(str));
    }
}
