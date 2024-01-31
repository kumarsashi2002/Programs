import java.util.*;
public class KartikProChant {
    public static void main(String[] args) {
        int N=4;
        int q=4;
        int[][] queries={{1,1,11},{2,4,5},{2,1,1},{1,3,8}};
        int[][] arr=new int[N][N];
        for(int i=0;i<N;i++){
            int index=queries[i][1];
            int value=queries[i][2];
                if(queries[i][0]==1){
                    
                    for(int j=0;j<N;j++){
                        arr[index-1][j]=value;
                        System.out.println(arr[index-1][j]+"...");
                    }
                }
                else{
                    for(int j=0;j<N;j++){
                        arr[j][index-1]=value;
                        System.out.println(arr[j][index-1]);
                    }
                }
        }

        int sum=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                sum=sum+arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
