import com.sun.org.apache.xpath.internal.operations.Mult;

/**
 * Created by mong on 1/7/17.
 */
public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        String small, large;
        if(num1.length() > num2.length()){
            small = num2;
            large = num1;
        }
        else{
            small = num1;
            large = num2;
        }
        String[] digits = digitMul(large);
        String[] nums = new String[small.length()];
        for(int i = 0; i < small.length(); i++){
            int d = small.charAt(small.length() - 1 - i) - '0';
            nums[i] = digits[d] + zeroes(i);
        }
        return add(nums);
    }

    public static String[] padZero(String... nums){
        int max = 0;
        for(String n: nums)
            if(n.length() > max)
                max = n.length();
        for(int i = 0; i < nums.length; i++){
            String s = nums[i];
            nums[i] = zeroes(max - s.length()) + s;
        }
        return nums;
    }

    public static String zeroes(int i){
        return new String(new char[i]).replace("\0", "0");
    }

    public static String add(String... nums){
        nums = padZero(nums);
        StringBuilder result = new StringBuilder(64);
        int carry = 0;
        int maxPlace = nums[0].length();
        for(int place = 0; place < maxPlace; place++){
            int sum = carry;
            for(String s: nums){
                sum += s.charAt(maxPlace - place - 1) - '0';
            }
            carry = sum / 10;
            result.append(sum % 10);
        }
        return (carry > 0 ? carry+"" : "") + result.reverse().toString();
    }

    public static String[] digitMul(String s){
        String[] digits = new String[10];
        digits[0] = "0";
        for(int i = 1; i < 10; i++){
            digits[i] = add(digits[i - 1], s);
        }
        return digits;
    }
}