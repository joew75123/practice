import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution38 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();

        backtrack(candidates,target,new ArrayList<>(),0);

        return res;
    }

    private void backtrack(int[] candidates, int remains, List<Integer> path, int index) {
        

    }

}
