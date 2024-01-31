import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWRepetition {
    public static void main(String args[]){
        String S="abcabcabcd";
        System.out.println(longestLength(S));
        System.out.println(method2(S));
    }

    /* First Method Using HashSet */
    static int longestLength(String S){
        int len=S.length();
        int i=0,j=0;
        int ans=0;
        //String s1="";
        HashSet <Character> hs =new HashSet<>();
        while(i<len && j<len){
            if(!hs.contains(S.charAt(j))){
                hs.add(S.charAt(j));
                j++;
                ans=Math.max(ans,j-i);
            }else{
                hs.remove(S.charAt(i));
                i++;
            }
        }
        return ans;
    }
    /* Second Method Using HashMap */
    static int method2(String s){
        HashMap <Character,Integer> hm =new HashMap<>();
        int i=0;
        int j=-1;
        int ans=0;
        boolean f1=false,f2=false;

        while(true){
            //Acquire until it become invalid
            while(i<s.length()){
                f1=true;
                i++;
                char ch=s.charAt(i);
                hm.put(ch,hm.getOrDefault(ch, 0)+1);
                if(hm.get(ch)==2){
                    break;
                }else{
                    ans=Math.max(ans,i-j);
                }
            }
            // Release until it become valid
            while(j<i){
                f2=true;
                //j++;
                char ch=s.charAt(j);
                hm.put(ch,hm.get(ch)-1);
                j++;
                if(hm.get(ch)==1){
                    break;
                }
            }
            if(f1==false && f2==false){
                break;
            }
        }
        return ans;
    }
}
