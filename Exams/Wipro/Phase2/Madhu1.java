public class Madhu1 {



    static int findRoomNo(int[] input1,int[] input2, int[] input3, int input4){
        int ans=0;
        int[] sum=new int[input4];
        for(int i=0;i<input4;i++){
            sum[i]=input1[i]+input2[i]+input3[i];
        }

        int[] sum2=new int[input4];
        for(int i=0;i<input4-1;i++){
            int count=0;
            int pos=sum[i]-1;
            if(pos>=input4){
                while(pos>=input4){
                    pos=pos/2;
                }
            }
            
            System.out.println(x);
            // sum2[i]=input1[pos];
            // sum2[i+1]=input2[pos];
            // sum2[i+2]=input3[pos];
            // sum2[i+3]=input3[pos];
        }

        for(int i=0;i<sum2.length;i++){
            ans=ans+sum2[i];
        }
        return ans;
    }
    public static void main(String args[]){
        int[] input1={1,2,3,4};
        int[] input2={2,3,4,5};
        int[] input3={1,3,5,7};
        int input4=4;
        int num=findRoomNo(input1, input2, input3, input4);
        System.out.println(num);

    }
}
