package MethodsTkachenko;
import java.util.Arrays;

public class TaskOne {
    //Написать метод (void) который переворачивает массив. В main должен быть вызванметод который переворачивает массив, потом вывести с помощью sout.
    // Важно - не вывести в консоль с последнего элемента, а проапдейтить существующий массив с помощью void
    public static void main(String[] args) {
        int[] array = {54, 18, 95, 13, 28, 80};
        int[] reversedArray = reverse(array);
        System.out.println("Reversed array : " + Arrays.toString(reversedArray));
    }
    static int[] reverse(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = array[i];
        }
        return newArray;
    }
}
