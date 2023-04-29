import java.util.Arrays;
import java.util.stream.IntStream;

public class Utils {
    public static int[] getuniq(int[] nums1) {
        return Arrays.stream(nums1).distinct().toArray();
    }


    public static int[] toOneArr (int[] arr1, int[] arr2){
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
    }


    public static int[] flatten(int[][]currentArr) {
        var rowsCount = currentArr.length;//длина массива
        if (rowsCount == 0) {
            return new int[0];// если длина массива равна нулю, то вернуть пустой массив
        }
        var columnCount = currentArr[0].length;//длина вложенного массива
        var elCount = rowsCount * columnCount;//подсчет всех элементов массива равен произведению длины внутреннего элемента на внешний

        var result = new int[elCount];// инициализируем итоговый массив, который равен elCount
        var i = 0;// инициализируем индекс
        for (var numRes : currentArr) {//делаем перебор входного массива
            for (var numEl : numRes) {//делаем перебор уже разобранного массива
                result[i] = numEl;//элемент массива равен числу
                i++;
            }

        }
        return result; // на выходе получаем одномерный массив
    }
    public static void bubbleSort(int[] nums){
        var stepsCount = nums.length-1;
        boolean swapped;
        do{
            swapped = false;
            for(int i = 0; i< stepsCount; i++){
                if(nums[i] > nums[i+1]){
                    var temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    swapped = true;
                }
            }
            stepsCount--;
        }while(swapped);
    }
}
