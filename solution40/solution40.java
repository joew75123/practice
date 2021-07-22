import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution40 {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res= new ArrayList<>();
        List<Integer> path;
        Arrays.sort(candidates);

        backtrack(candidates, target, new ArrayList<>(), 0);
        return res;
    }

    private void backtrack(int[] candidates, int remains, List<Integer> path, int index) {
        int length= candidates.length;
        if(remains==0){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index; i<length; i++){
            if(candidates[i]>remains){
                return;
            }

            if(i>index&&candidates[i]==candidates[i-1]){
                continue;
            }

            path.add(candidates[i]);
            backtrack(candidates,remains-candidates[i], path, i+1);
            path.remove(path.size() - 1);

        }
    }
}
