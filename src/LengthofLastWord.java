/**
 * Created by mong on 1/11/17.
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(' ') - 1;
    }
}