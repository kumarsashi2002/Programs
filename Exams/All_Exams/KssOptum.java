import java.util.HashMap;
public class KssOptum {
    public static void main(String args[]){
        int input1=3;
        int[] input2={4,3,2,2};
        int ans=perm(input1, input2);
        System.out.println(ans);
    }
    static int perm(int input1, int[] input2){
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<input1;i++){
            hm.put(input2[i],hm.getOrDefault(input2[i], 0)+1);
        }
        int count=0;
        for(int i=1;i<=input1;i++){
            if(!hm.containsKey(i)){
                count++;
            }
        }
        return count;
    }
}
