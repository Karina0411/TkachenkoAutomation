package HomeWork3;

public class TaskOne {
    public static void main(String[] args) {
        //1. Написать программу, которая находит минимальное значение в массиве
        int[] numbers = {95, 12, 86, 604, 58, 13};
        int smallest = numbers[0];
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Min value is " + smallest);
    }
}
