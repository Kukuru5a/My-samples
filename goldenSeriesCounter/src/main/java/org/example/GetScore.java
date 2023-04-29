package org.example;

public class GetScore {
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
}
