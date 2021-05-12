package HomeWork3;

import java.util.Arrays;

public class TaskThree {
    public static void main(String[] args) {
        //3. Написать программу, которая сортирует массив от минимума в максимум
        int [] value = {95, 12, 86, 604, 58, 13};
        Arrays.sort(value);
        for (int i = 0; i <= value.length-1; i++){
            System.out.println(value[i]);
        }
    }
}


