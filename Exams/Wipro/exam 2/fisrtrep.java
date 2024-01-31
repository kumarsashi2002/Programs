import java.util.*;
public class fisrtrep {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int size=sc.nextInt();
        // int input11[]=new int[size];
        int input1[]={1,2,3,0,5,0,3,2,7};



        boolean flag=false;
        boolean flag2=false;
        int value=0;
        for(int i=0;i<input1.length;i++){
            if(input1[i]<0 || input1[i]!=0){
                flag2=true;
                //return 0;
                //System.out.println("0");
            }
        }
        HashSet <Integer> hs=new HashSet<>();
        for(int i=0;i<input1.length;i++){
            if(hs.contains(input1[i])){
                if(input1[i]<0 || input1[i]==0){
                    
                }else{
                    //System.out.println(input1[i]) ;
                    flag=true;
                    value=input1[i];
                    //return input1[i];
                }
                
            }else{
                hs.add(input1[i]);
            }
        }
        if(flag2==false){
            //return 0;
        }
        if(flag){
            System.out.println(value);
            //return value;
        }else{
            System.out.println(input1[0]);
            //return input1[0];
        }
    }
}
