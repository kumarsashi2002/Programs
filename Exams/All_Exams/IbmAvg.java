import java.util.*;

public class IbmAvg {
    public static void main(String args[]){
        List <Integer> inputArray =new ArrayList<>();
        inputArray.add(444);
        inputArray.add(514);
        inputArray.add(540);
        inputArray.add(518);
        inputArray.add(825);
        inputArray.add(940);
        inputArray.add(585);
        double ans=calculateAverage(inputArray);
        System.out.println(ans);
    }

    static double calculateAverage(List <Integer> inputArray){
        double ans=0;
        double count=0;
        for(int i=0;i<inputArray.size();i++){
            if(inputArray.get(i)%3==0 && inputArray.get(i)%2==0){
                ans=ans+inputArray.get(i);
                count++;
            }
        }
        double avg=ans/count;
        return avg;
    }
}
