package solution49;

import java.util.*;

public class solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res=new HashMap<>();
        for(String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key=String.valueOf(chars);
            if(!res.containsKey(key)){
                res.put(key,new ArrayList<>());
            }
            res.get(key).add(s);
        }
        return new ArrayList<List<String>>(res.values());
    }
}