public class ArrayUtils {
    public static boolean contains(char[] chs, char ch){

        boolean res = false;
        for(char ch1 : chs){
            if(ch1 == ch){
                res = true;
            }
        }
        return res;
    }
}
