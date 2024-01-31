public class MayankTata {
    public static void main(String[] args) {
        int[][] input2={{5,10},{8,12}};
        int input1=2;
        System.out.println(max(input1, input2));
    }
    public static int max(int input1,int[][] input2) {
        int dist = input2[0][1] - input2[0][0];
        int prev = 0;
        for (int i = 1; i < input2.length; i++) {
        if (input2[prev][1] > input2[i][0]) {
        dist += input2[i][1] - input2[prev][1];
        } else {
        dist += input2[i][1] - input2[i][0];
        }
        prev = i;
        }
        return dist;
    }
}
