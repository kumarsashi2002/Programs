public class For13 {
    public static void main(String[] args) {
        boolean flag=true;
        for(int i=11;i<99;i++){
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
            flag=true;
        }
    }
}
