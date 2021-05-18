package HomeWork3;

public class TaskSix {
    public static void main(String[] args) {
        //6. Написать программу, которая подсчитывает количество элементов массива int*ов, которые делятся на 2, но не делятся на 3 и выводит в консоль
        System.out.println("Divided by 2 and not devided by 3 numbers of array: ");
        for (int a=1; a<100; a++) {
            if (a%2==0 & a%3!=1)
                System.out.print(a +", ");
        }
    }
}
