public class WilleyEdge1 {
    public static void main(String args[]){
        int n=6;
        int val=0;
        int value2=0;
        for(int i=1;i<=n;i++){
            value2=0;
            if(i%2!=0){
                for(int j=1;j<=i;j++){
                    System.out.print("*" + " ");
                }
            }
            else{
                for(int j=0;j<=i-1;j++){
                    val=val+100;
                    System.out.print(val + " ");
                    value2=j;
                }
                val=val-value2*100;
            }
            System.out.println();
        }
    }
}
