package HomeWork3;

import java.util.Random;

public class TaskEight {
    public static void main(String[] args) {
        //Task8
        //1. Бросьте кубик за пользователя (сгенерируйте случайное число от 1 до 6) и
        //продвиньте пользователя на это количество делений на игровом поле.
        //2. После каждого броска вывести инфо в консоль пользователю, на каком игровом
        //поле он находится и сколько еще мест ему нужно пройти, чтобы выиграть.
        //3. Всего 5 бросков
        //4. Если пользователь набирает 20 до 5 бросков, завершите игру - он выиграл.
        //5. Если пользователь набирает больше или меньше 20 точно, то он проигрывает.
        //6. Помните, что на доске всего 20 делений, поэтому сообщение типа «Вы
        //продвинулись на позицию 22» - это баг)

        int dice1 = (int) (Math.random() * 6 + 1);
        System.out.println("Your 1st dice is " + dice1);
        System.out.println("You move to  " + dice1 + " from 20");

        int dice2 = (int) (Math.random() * 6 + 1);
        int sum12 = dice1 + dice2;

        System.out.println("Your 2nd dice is " + dice2);
        System.out.println("You move to " + sum12 + " from 20");

        int dice3 = (int) (Math.random() * 6 + 1);
        int sum123 = dice1 + dice2 + dice3;

        System.out.println("Your 3rd dice is " + dice3);
        System.out.println("You move to " + sum123 + " from 20");

        int dice4 = (int) (Math.random() * 6 + 1);
        int sum1234 = dice1 + dice2 + dice3 + dice4;

        System.out.println("Your 4th dice is " + dice4);
        System.out.println("You move to " + sum1234 + " from 20");

        int dice5 = (int) (Math.random() * 6 + 1);
        int sum12345 = dice1 + dice2 + dice3 + dice4 + dice5;

        System.out.println("Your 5th dice is " + dice5);
        System.out.println("You move to " + sum12345 + " from 20");

        if (sum123 ==20 | sum1234 ==20 | sum12345 ==20) {
            System.out.println("You have won!");
        } else if (sum12345 < 20) {
            System.out.println("You have lost");
        } else {
            System.out.println("There are only 20 divisions on the board. You have lost.");
        }
    }
}



