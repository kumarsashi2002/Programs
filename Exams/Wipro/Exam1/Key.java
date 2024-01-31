public class Key {
    public static void main(String[] args) {
        int input1=3521;
        int input2=2452;
        int input3=9352;
        int max=0;
        while(input3>0){
            int n=input3%10;
            if(n>max){
                max=n;
            }
            input3=input3/10;
        }
        int hp=input2%1000;
        hp=hp/100;
        int key=(input1/1000) * (hp) - max;
        //System.out.println(max);
        System.out.println(key);
    }
}
