package HomeWork3;

import java.lang.Math;

public class TaskTwo {
    public static void main(String[] args) {
        //2. Написать программу, которая печатает значения sin(x), где x это каждые 10 градусов от 0 до 360
        for (int x = 0; x <= 360; x += 10) {
            System.out.println("Sin is " + x);
            System.out.println(Math.sin(x));
        }
    }
}