package HomeWork3;

public class TaskSeven {
    public static void main(String[] args) {
        //7.  Написать программу, который переворачивает массив
        int[] number = {8, 10, 98, 75, 4, 11, 82};
        for (int a = 0; a < number.length; a++) {
        }
        for (int a = number.length - 1; a >= 0; a--) {
            System.out.println("Reversed Array is: ");
            System.out.print(number[a]);
        }
    }
}
