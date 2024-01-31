import java.io.*;
import java.util.*;
 
class Solution {
    
    public static int array_sort(int[] inp_arr, int size_of_array)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size_of_array; i++)
            map.put(inp_arr[i], i);
 
        Arrays.sort(inp_arr);
 
        boolean[] visited = new boolean[size_of_array];
        Arrays.fill(visited, false);

        int ans = 0;
        for (int i = 0; i < size_of_array; i++) {
            if (visited[i] || map.get(inp_arr[i]) == i)
                continue;
 
            int j = i, cycle_size = 0;
            while (!visited[j]) {
                visited[j] = true;
 
                j = map.get(inp_arr[j]);
                cycle_size++;
            }

            if (cycle_size > 0) {
                ans += (cycle_size - 1);
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int[] inp_arr = {3,8,2,1};
        int size_of_array=inp_arr.length;
        Solution s = new Solution();
        System.out.println(s.array_sort(inp_arr,size_of_array));
    }
}
 