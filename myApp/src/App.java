import jdk.jshell.execution.Util;

import java.util.Arrays;



public class App {

    public static void main() {
        App.gogo();
    }

    public static void gogo() {
        var text = "It works!";
        System.out.println(text);
    }

    public static String sayHurrayThreeTimes() {
        var text = "hurray ";
        var txt = text + text + text;
        return txt;

    }

    public static char getLastChar(String str) {
        return str.charAt(str.length() - 1);
    }

    public static String replaceString(String text, String from, String to) {
        return text.replace(from, to);
    }

    public static String tercate(String text, int length) {
        var txt = text;
        var index = length;
        var finalCut = text.substring(0, index);
        return finalCut + "...";
    }

    public static String getHiddenCard(String cardNum) {
        return cardNum.replace(cardNum.substring(0, cardNum.length() - 4), "*".repeat(4));
    }

    public static String getHiddenCard(String cardNum, int repNum) {

        return cardNum.replace(cardNum.substring(0, cardNum.length() - 4), "*".repeat(repNum));
    }

    public static boolean isLeapYear(int year) {
        var yr = (year % 400 == 0) || (year % 4 == 0 && !(year % 100 == 0));
        System.out.println(yr);
        return yr;
    }

    public static String ifSentense(String str) {
        var firstLetter = str.charAt(0);

        if (Character.isUpperCase(firstLetter)) {
            return str.toLowerCase();// For test
        } else if (!Character.isUpperCase(firstLetter)) {
            return str.toUpperCase();
        } else {
            return "";
        }

    }

    public static String numExplanation(int num) {
        switch (num) {
            case 666:
                return "the Devil number";
            case 42:
                return "answer for everything";
            default:
                return null;

        }
    }

    public static void printNumbers(int firstNum) {
        var i = firstNum;
        while (i >= 1) {
            System.out.println(i);
            i -= 1;
        }
        System.out.println("finished");
    }

    public static int sumNumRange(int start, int finish) {
        var i = start;
        var sum = 0;
        while (i <= finish) {
            sum += i;
            i += 1;
        }
        return sum;
    }

    public static String joinNumRange(int start, int finish) {
        var i = start;
        var result = "";
        while (i <= finish) {
            var s = Integer.toString(i);
            result = result + s;
            i += 1;
        }
        return result;
    }

    public static int countChars(String str, char ch) {
        // BEGIN (write your solution here)
        var i = 0;
        var count = 0;

        while (i < str.length()) {
            if (str.charAt(i) == Character.toLowerCase(ch) || str.charAt(i) == Character.toUpperCase(ch)) {
                count = count + 1;
            }
            i = i + 1;
        }

        return count;
    }

    public static boolean greaterThan(String word1, String word2) {
        var myCounter = new Counter();
        if (myCounter.bigLettersCount(word1) > myCounter.bigLettersCount(word2)) {
            return true;
        }
        return false;
    }

    public static String[] getWeekends(String args) {
        String[] weekends1 = {"sat", "sun"};
        String[] weekends2 = {"saturday", "sunday"};

        String[] result = {};
        var statement = args;
        var word1 = "short";
        var word2 = "long";
        if (statement.equals(word1)) {
            result = weekends1;
        } else {
            result = weekends1;
        }
        return result;
    }

    public static int[] swap(int[] nums) {

        int[] newNums = nums;
        for (int i = 0; i < nums.length; i++) {

            if (nums.length < 2) {
                newNums = nums;
            } else {
                newNums[0] = nums[nums.length - 1];
                newNums[nums.length - 1] = nums[0];
            }
            i = i + 1;
        }
        return newNums;
    }


    public static int getTotalAmount(String[] strs, String str) {

        int result = 0;
        for (String values : strs) {
            if (!str.equals(values.substring(0, 3))) {

            }
            result += Integer.parseInt(values.substring(4, values.length()));
        }

        return result;
    }
    public static String buildDefinitionList(String[][] definitions) {

        if (definitions.length == 0) {
            return "";
        }
        String[] res = new String[definitions.length];
        var result = new StringBuilder("<dl>");

        for (var item : definitions) {

            result.append("<dt>");
            result.append(item[0]);//???
            result.append("</dt>");// количество скопированных строк не обязательо повторять много раз!! Достаточно отметить что к чему, в данном случае 1 раз dt 1 раз dd далее for-each сам перебирает
            result.append("<dd>");
            result.append(item[1]);
            result.append("</dd>");

        }
        result.append("</dl>");
        return result.toString();
    }
    public static char[] getUniqChar(String str){
        char[] chs = str.toCharArray();
        if(chs.length == 0){
            return new char[0];
        }
        char[] newChs = new char[chs.length];
        char[] res = new char[newChs.length];
        int i = 0;
        for(var ch: chs) {
            if (ch == str.charAt(i)) {
                newChs[i] = ch;
                i++;
            }
            for(var ch1 : newChs){
                if(ch == ch1){
                    res[i] = chs[i+1];
                }
            }
        }
        return Arrays.copyOfRange(res, 0, i);
    }
    public static int countUniqChars1(String str) {
        int count = 0; // инициализирую счетчик

        char[] chs = str.toCharArray(); // разбиваю строку на массив символов
        char[] res = new char[chs.length]; // копия массива где будут храниться уникальные элементы

        for (char ch : chs){ //прогоняю массив на наличие уникальных элементов
            if(!(ArrayUtils.contains(res, ch))){
                res[count] = ch; // если в РЕЗУЛЬТУРЮЩЕМ массиве не содержатся элементы из исходного массива - совершить перенос, пойти далее по циклу
                count ++;
            }
        }
        return count;
    }
    public static int[] getIntersectionOfSortedArrays(int[] nums1, int[] nums2){
        int[] newNums1 = new int[nums1.length];
        int[] newNums2 = new int[nums2.length];
        int[] res = new int[nums1.length+nums2.length];
        int index = 0;
        for(int num1 : nums1){
            for(int num2 : nums2){
                if(num1 == num2 && (index == 0 || num1 != res[index-1])){//элемент при копировании сравнивался уже с имеющимся элементом(index -1) в результирующем массиве и не копировался туда снова в случае уже имеющегося такого же
                    res[index] = num1;
                    index++;
                }
            }
        }


        var result = Arrays.copyOf(res, index);
        return result;
    }
    public static String getHostCheck(Url url){
        String res = "";
        if(url.getProtocol().equals("https")){
            res = "The connection to  " + url.getHost() + " is secure";
        }
        if (url.getProtocol().equals("http")){
            res = "The connection to " + url.getHost() + " is not secure";
        }
        return res;
    }

}

