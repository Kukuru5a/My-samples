
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int[] numbers1 = {10, 10, 13, 14, 18, 24, 24, 30};
        int[] numbers2 = {10, 10, 11, 24, 24};
        var result = App.getIntersectionOfSortedArrays(numbers1, numbers2);
        int[] nums = {0, 4, 0, 10, -3};
        String str = "you know nothing Jon Snow";
        var str1 = str.toCharArray();
        Utils.bubbleSort(nums);
        int[] coll1 = {1, 2, 3};
        int[] coll2 = {3, 8, 10};
        System.out.println();
        char ch1 = '(';
        char ch2 = ')';

        var user1 = new User(12, "Nick");
        var user2 = new User(1, "Nick12");

        var res = user2.isEqual(user1);

        
        System.out.println(res);
        var str2 = "())(()";
        var poweredNum = Counter.isbalanced(str2);
        System.out.println(poweredNum);
    }
}












