import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by mong on 1/7/17.
 */
public class LongestSubstringWithoutRepeatingCharacters {
        public int lengthOfLongestSubstring(String s) {
            Map<Character, Integer> m = new HashMap<>();
            int maxStart = 0, maxLen = 0;
            int start = 0;
            for(int i = 0; i < s.length(); i++){
                char curr = s.charAt(i);
                if(m.containsKey(curr)){
                    int newStart = m.get(curr) + 1;
                    if(maxLen < m.size()){
                        maxStart = start;
                        maxLen = m.size();
                    }
                    start = newStart;
                    ridPrev(m, start);
                }
                m.put(curr, i);
            }
            if(maxLen < m.size()) return m.size();
            return maxLen;
        }

        public void ridPrev(Map<Character, Integer> m, int i){
            Iterator<Integer> iter = m.values().iterator();
            while(iter.hasNext()){
                int v = iter.next();
                if(v < i){
                    iter.remove();
                }
            }
        }
    }