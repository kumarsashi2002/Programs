import java.util.*;
public class MadhuTata {
    public static void main(String[] args) {
        int input1=6;
        int[] input2={4,9,5,3,2,10};
        System.out.println(Arrays.toString(placement(input1, input2)));
    }
    public static int[] placement(int input1, int[] input2){
        int[] ans=new int[input1];
        ans[0]=0;
        // int index=2;
        int id=1;
        for(int i=0;i<input1;i++){
            int count=0;
            for(int j=0;j<i;i++){
                if(input2[i]>input2[j]){
                    count++;
                }
            }
            id++;
            ans[id]=count;
        }
        return ans;
    }
}
