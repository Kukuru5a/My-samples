import java.util.Arrays;

public class Counter {

    public static int bigLettersCount(String str) {
        var result = 0;
        int i = 0;
        while(i<str.length()) {
            if (str.charAt(i) == Character.toUpperCase(str.charAt(i)) ) {
                result = result + 1;

            }
            i = i + 1;
        }
        return result;
    }
    public static int[] swap(int[] nums){
        int[] newNums = nums;
        if(nums.length<2){
            newNums = nums;
        }else{
            int num = newNums[0];
            newNums[0] = nums[nums.length-1];
            newNums[nums.length-1] = num;
        }
        return newNums;
    }
    public static String[] getPrefix(String[] strs, String str) {
        String[] names = new String[strs.length];
        for (var i = 0; i < strs.length; i++) {
            names[i] = (str + " " + strs[i]);
        }
        return names;
    }
    public static int calculateSum(int[] nums){
        var sum = 0;
        for(int i = 0; i<nums.length; i++){
            if(i % 3 == 0){
                sum = sum + nums[i];
            }
            sum = sum;
        }
        return sum;
    }
    public static int[] getSameParity(int[] nums) {
        if(nums.length == 0){
            return new int[0];
        }
        int[] result = new int[nums.length];

        int i = 0;
        int isEvalNum = Math.abs(nums[0] % 2);

        for (int number : nums) {
            if(Math.abs(number % 2) == isEvalNum){
                result[i] = number;
                i++;
            }

        }
        return Arrays.copyOfRange(result, 0, i);
    }
    public static int charCount(String str){
        var result = 0;
        char[] chs = str.toCharArray();
        int i = 0;
        for(var ch : chs){
            i ++;
            if(ArrayUtils.contains(chs, ch)){
                result += 1;
            }

        }
        return result;
    }
    public static boolean isbalanced(String str){
        boolean result = false;
        var bracketsCount1 = 0;
        var bracketsCount2 = 0;

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                bracketsCount1+=1;
            }
            if(str.charAt(i) == ')'){
                bracketsCount2 +=1;
            }

        }
        if(bracketsCount1 == bracketsCount2){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

}