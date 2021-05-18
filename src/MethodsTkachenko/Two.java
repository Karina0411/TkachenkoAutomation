package MethodsTkachenko;

import java.util.Scanner;

public class Two {
    //Расчёт зарплаты нужно разбить на несколько методов:
    //1.Первый метод получает количество отработанных часов и базовую ставку
    //если количество отработанных часов больше 160 то каждый последующий час по коэф 1,5 (параметры у метода - входящие часы int, возвращаемое значение double
    // коэффициент)
    //2. Второй метод - получает коэффициент на базовые часы (которые до 160) в
    //зависимости от стажа работы (параметры у метода - стаж работы int,
    //возвращаемое значение double коэффициент)
    //до 2 лет 1
    //от 2 до 4 - 1.2
    //от 4 до 6 - 1.3
    //от 6 лет - 1.4
    //3. В зависимости от количества продаж - больше 20 - бонус 250,
    // меньше 10 - штраф 150 (параметры у метода - количество продаж int, возвращаемое  значение double бонус за количество продаж)
    //4. четвертый в зависимости от суммы продаж больше 15000 $ - тоже добавляется бонус (параметры у метода - сумма продаж double, возвращаемое значение
    //double бонус за сумму продаж)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your working hours ");
        int workHour = scanner.nextInt();

        System.out.println("Your longevity ");
        int longevity = scanner.nextInt();

        System.out.println("Number of Sales ");
        int sale =scanner.nextInt();

        System.out.println("Total sum of sales ");
        double sumOfSales =scanner.nextDouble();

        double thisMonthSalary = workingHours(workHour) + workingYears()
    }

    public static int workingHours(int workHour)
    //1.Первый метод получает количество отработанных часов и базовую ставку
    //если количество отработанных часов больше 160 то каждый последующий час по коэф 1,5 (параметры у метода - входящие часы int, возвращаемое значение double
    // коэффициент)
    {
        if (workHour <= 160) return (workHour * 10);
        else return 160 * 10 + (workHour - 160) * 15;
    }

    public static int workingYears(int workHour, int longevity) {
        // Второй метод - получает коэффициент на базовые часы (которые до 160) в зависимости от стажа работы (параметры у метода - стаж работы int, возвращаемое значение double коэффициент)
        //до 2 лет 1
        //от 2 до 4 - 1.2
        //от 4 до 6 - 1.3
        //от 6 лет - 1.4
        if (workHour <= 160 && longevity < 2) return workingHours(workHour * 1);
        if (workHour <= 160 && longevity = 2 < 4) return workingHours(workHour * 1.2);
        if (workHour <= 160 && longevity = 4 < 6) return workingHours(workHour * 1.3);
        if (workHour <= 160 && longevity > 6) return workingHours(workHour * 1.4);
    }

    static int numberOfSales (int sale)
    //3. В зависимости от количества продаж - больше 20 - бонус 250, меньше 10 - штраф 150 (параметры у метода - количество продаж int, возвращаемое  значение double бонус за количество продаж)
    {
        if (sale > 20) return  (workHour + 250);
        if (sale < 10) return (workHour - 150);
        else return workHour + 0;
    }
    static double sumOfSales (double salesSum) {
        //4. четвертый в зависимости от суммы продаж больше 15000 $ - тоже добавляется бонус (параметры у метода - сумма продаж double, возвращаемое значение double бонус за сумму продаж)
        if (salesSum > 15000.0)  return
    }
}