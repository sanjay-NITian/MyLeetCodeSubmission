import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_90_Subsets_II {
    static class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> list = new ArrayList<List<Integer>>();
            subset(nums, 0, new ArrayList<Integer>(), list,false);
            return list;
        }
        public static void subset(int[] arr,int index,List<Integer> temp,List<List<Integer>> finallist,boolean flag){
            // creating the basecase
            if(index==arr.length){
                finallist.add(new ArrayList<Integer>(temp));
                return;
            }
            // if the previous call was included then call include only else call include and exclude both
            if(flag && arr[index-1]==arr[index]){   // Observe the second case sincerly
                temp.add(arr[index]);
                subset(arr, index+1, temp, finallist,true);
                temp.remove(temp.size()-1);
            }else{
                temp.add(arr[index]);
                subset(arr, index+1, temp, finallist,true);
                temp.remove(temp.size()-1);
                subset(arr, index+1, temp, finallist,false);
            }
        }
    }
}
