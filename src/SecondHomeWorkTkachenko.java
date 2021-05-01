public class SecondHomeWorkTkachenko {
    public static void main(String[] args) {
        //1. Написать программу с названием “CheckPassFail”, которая выводит PASS если переменная “mark” типа int больше или равно 50 или вывести “FAIL”
        // в противном случае Программа всегда должна перед выходом печатать “DONE”
        int mark = 55;
        if (mark >= 50) {
            System.out.println("Done. Pass");

        } else {
            System.out.println("Done. Fail");
        }

        //2. Написать программу с названием “CheckOddEven”, которая печатает “Odd Number”. если переменная “number” типа int нечетная. Или “Even Number” если переменная четная.
        // Программа всегда должна перед выходом печатать “BYE”
        int number = 9;
        if (number % 2 == 0) {
            System.out.println("Bye. This is Even Number");
        } else {
            System.out.println("Bye. This is Odd Number");
        }

        //3.1. Написать программу с названием “PrintNumberInWord”, которая напечатает “ONE”, “TWO”, …, “NINE”, “OTHER” если переменная “number” типа int будет 1, 2, 3, 4, … 9, или любой другой SWITCH
        int NumberinWord = 1;
        switch (NumberinWord) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Other");
                break;
        }

        //3.2. Написать программу с названием “PrintNumberInWord”, которая напечатает “ONE”, “TWO”, …, “NINE”, “OTHER” если переменная “number” типа int будет 1, 2, 3, 4, … 9, или любой другой IF ELSE
        int WordNum = 5;
        if (WordNum == 1) {
            System.out.println("One");
            if (WordNum == 2)
                System.out.println("Two");
        } else if (WordNum == 3)
            System.out.println("Three");
        if (WordNum == 4)
            System.out.println("Four");
        if (WordNum == 5)
            System.out.println("Five");
        if (WordNum == 6)
            System.out.println("Six");
        if (WordNum == 7)
            System.out.println("Seven");
        if (WordNum == 8)
            System.out.println("Eight");
        if (WordNum == 9) {
            System.out.println("Nine");
        } else if (WordNum > 9 | WordNum < 1) {
            System.out.println("Other");
        }

        //4.1. Написать программу с названием “PrintDayInWord”, которая печатает “Sunday” “Monday”, …. “Saturday”, если переменная “day” типа int будет 1, 2, 3, 4 … 7. В противном случае программа
        // должна вывести “Not a valid day” SWITCH
        int days = 5;
        switch (days) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("no answer is provided");
                break;
        }

        //4.2. Написать программу с названием “PrintDayInWord”, которая печатает “Sunday” “Monday”, …. “Saturday”, если переменная “day” типа int будет 1, 2, 3, 4 … 7. В противном случае программа
        //должна вывести “Not a valid day” IF ELSE
        int DofW = 7;
        if (DofW == 1)
            System.out.println("Sunday");
        if (DofW == 2)
            System.out.println("Monday");
        if (DofW == 3)
            System.out.println("Tuesday");
        if (DofW == 4)
            System.out.println("Wednesday");
        if (DofW == 5)
            System.out.println("Thursday");
        if (DofW == 6)
            System.out.println("Friday");
        if (DofW == 7) {
            System.out.println("Saturday");
        } else if (DofW > 7 | DofW < 1) {
            System.out.println("no answer is provided");
        }

        //5.Написать программу, которая сравнивает два числа типа int и определяет, какое из чисел большее, а какое меньшее. Программа должна вывести что-то типа “The number x has the greatest value”.
        // Где “x” одно из чисел
        int firstNum = 91;
        int secondNum = 80;
        if (firstNum > secondNum) {
            System.out.println(+firstNum + " is greater than " + secondNum);
        } else if (secondNum > firstNum) {
            System.out.println(+secondNum + " is greater than " + firstNum);
        } else {
            System.out.println("Numbers are equal");
        }

        //6. Написать программу, которая бы решала уравнение вида a*x + b = 0 Переменные a и b можно задать вручную. Далее нужно будет посчитать и вывести значение “х”.
        //Программа должна также учитывать варианты, когда или а = 0 или b = 0
        int at = 5;
        int bt = 4;
        int xt = -bt / at;
        System.out.println("x= " + xt);


        //7. Написать программу, для расчёта зарплаты менеджера по продажам. Если менеджер совершил более 10 продаж он получает бонус 250$. Базовая ставка 1000$.
        int rate = 1000;
        int sale = 11;
        int withbonus = rate + 250;
        if (sale > 10) {
            System.out.println("Your this month`s salary is equal to " + withbonus + " because you`ve made more than 10 sales.");
        } else {
            System.out.println("Your this month`s salary is equal to " + rate + ". You`ve made less than 10 sales.");
        }

        //8. Написать программу, которая выведет в консоль если количество продаж больше 10 сообщение что менеджер заработал бонус, если меньше, то выполнит расчёт сколько осталось продаж
        // до получения бонуса
        int sales = 11;
        int bonusNumber = 10;
        int bonus = bonusNumber - sales;
        if (sales > 10) {
            System.out.println("You`ve got bonuses");
        } else {
            System.out.println("To get some bonuses you need to make " + bonus + " sales");
        }

        //9. Получение ипотеки. Имеем 2 переменные - возраст мужа и жены. Написать программу, которая выводит в консоль результат.
        //Задачу решить используя вложенный if (сначала проверить возраст жены, потом мужа).
        //Проверить что возраст меньше 35 (Написать boolean - который возвращает true, если им обоим менее 35 лет (логические выражения и операторы сравнения), если кому то больше, то false)
        int ageH = 35;
        int ageW = 35;
        if (ageH > 35 | ageW > 35) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

        //10. Написать метод, используя switch, который принимает в себя номер пальца переменную типа int и в зависимости от номер выводит название пальца 1-”большой” и т д)
        int finger = 2;
        switch (finger) {
            case 1:
                System.out.println("little finger");
                break;
            case 2:
                System.out.println("ring finger");
                break;
            case 3:
                System.out.println("middle finger");
                break;
            case 4:
                System.out.println("index finger");
                break;
            case 5:
                System.out.println("thumb");
            default:
                System.out.println("no answer is provided");
                break;
        }

        //11. Сумма покупки составляет а рублей. Если а больше 1000 рублей, то предоставляетс скидка 15%. Вывести на экран сумму покупки с учетом скидки либо сообщение о том, что скидка не предоставляется.
        double price = 2000;
        double percentage = 15;
        double discount = price * percentage / 100;
        double sum = price - discount;
        if (price > 1000) {
            System.out.println("Purchase amount with discount is equal to " + sum);
        } else {
            System.out.println("Discount is not available. Amount without discount is equal to " + price);
        }

        //13. Определить, является ли число а делителем числа b
        int a = 9;
        int b = 3;
        if (a % b == 0) {
            System.out.println(a + " is a devider for " + b);
        } else {
            System.out.println(a + " is NOT a devider for " + b);
        }
    }
}



