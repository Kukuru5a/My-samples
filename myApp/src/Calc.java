import java.util.Arrays;
import java.util.stream.IntStream;


public class Calc {
    public static String getSuperCupWinner(int scores[][]) {
        String result = " "; // нам нужно псчитать количество побед, а не забитых шайб!!!!
        int i = 0;
        var gameWinner = 0;
        for (i = 0; i < scores.length; i++) {
            var gameRes = scores[i][0] - scores[i][1];
            var gameWin = Integer.signum(gameRes);
            gameWinner = gameWinner + gameWin;
            if (gameWinner > 0) {
                result = "canada";
            }
            if (gameWinner == 0) {
                result = "draw";
            }
            if (gameWinner < 0) {
                result = "ussr";
            }
        }
        return result;
    }

    public static int[] scoreSum(int[][] scores) {// сумма шайб


        int[] res = new int[scores.length - 6];
        int canadaScore = 0;
        int ussrScore = 0;
        for (int i = 0; i < scores.length; i++) {
            canadaScore = canadaScore + scores[i][0];
            ussrScore = ussrScore + scores[i][1];
            res[0] = canadaScore;
            res[1] = ussrScore;
        }
        return res;

    }

    public static int gameRes(int[][] scores) { // сумма побед
        int result = 0;
        int i = 0;
        int gameWinner = 0;
        for (i = 0; i < scores.length; i++) {
            var gameRes = scores[i][0] - scores[i][1];
            gameWinner = Integer.signum(gameRes);
            result = result + gameWinner;

        }
        return result;
    }


    public static int getSomeScore(int[] arr1, int[] arr2) {
        var result = 0;
        var newArr = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
        var newArrCorrect = Utils.getuniq(newArr);
        for (var num : newArrCorrect) {
            result = result + num;
        }
        return result;
    }

    public static int getSameCount(int[] nums1, int[] nums2) {
        int commonNums = 0;// bнициализировали результат который мы ихем
        int[] newInt1 = Utils.getuniq(nums1);//убрали все дубликаты
        int[] newInt2 = Utils.getuniq(nums2);// здесь тоже
        int i = 0;//индекс, наверное лучше for-each
        for (var num1 : newInt1) { // !действительно for-each справился с задачей!
            for (var num2 : newInt2) {
                if (num1 == num2) {
                    commonNums = commonNums + 1;
                }
            }
        }
        return commonNums;
    }



    public static boolean powerOfThree(int n) { // если число является степенью тройки - вернуть true
        boolean result = false;

        if (n < 1){
            return false;
        }//мы не можем получить ноль, возведя тройку в степень

        while (n % 3 == 0){
            n /= 3; // пока число делится на три без остатка, делим его на 3
        }
        return n == 1;
    }
    public static double getSquare(int a, int b, int c){
        double res = 0.0; // S = ((a*b)/2)*sin c(rad); c(rad) = c*3.14/180
        double cRad = (c*3.14)/180;
        double sinC = Math.sin(cRad);
        res = ((a*b)/2) * sinC;

        return res;
    }

}


