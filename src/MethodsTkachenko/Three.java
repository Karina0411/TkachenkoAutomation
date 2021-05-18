package MethodsTkachenko;

import java.util.Scanner;

public class Three {
    //Рассчитать стоимость пакета в месяц.
    //Расчёт по каждому из параметров сделать в отдельном методе.
    //Потом общий подсчёт провести в методе main и вывести в консоль c помощью sout
    //1. Стоимость интернета до 8гб включена в пакет, после 50 грн / 500 мб (вход параметр кол-во потраченных гб)
    //2. Звонки по Украине до 500 минут 0,5 грн / мин после 0,75
    //3. Смс до 50 шт 1 грн после 1,50
    //4.Звонки за рубеж зона 1 1.5 грн/мин
    //5.Звонки за рубеж зона 2 2 грн/мин
    //После подсчёта суммы добавляется налог 7 %
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of spent GB ");
        double spentGB = scanner.nextDouble();

        System.out.println("Number of Spent Minutes ");
        double ukraineMinute = scanner.nextDouble();

        System.out.println("Enter number of sent sms  ");
        double sms = scanner.nextDouble();

        System.out.println("Enter number of calls to Zone 1 ");
        double numberOfCallsZoneOne = scanner.nextDouble();

        System.out.println("Enter number of calls to zone 2 ");
        double numberOfCallsZoneTwo = scanner.nextDouble();

        double finalSum = (internetCost(spentGB) + ukraineCallsMinutes(ukraineMinute) + sentSms(sms) + callsZoneOne(numberOfCallsZoneOne) + callsZoneTwo(numberOfCallsZoneTwo)) * 1.07;
        System.out.println("Mobile tariff this month cost you " +finalSum);

    }

    static double internetCost(double spentGB)
    {
        if (spentGB <= 8) return 0;
        else return (spentGB - 8) * 1024 * 0.1;
    }
    //2. Звонки по Украине до 500 минут 0,5 грн / мин после 0,75
    static double ukraineCallsMinutes(double ukraineMinute)
    {
        if (ukraineMinute <= 500) return (ukraineMinute * 0.5);
        else return 500 * 0.5 + (ukraineMinute - 500) * 0.75;

    }
    static double sentSms(double sms)
    {
        if (sms <= 50) return (sms * 1);
        else return 50 * 1 + (sms - 50) * 1.50;
    }

    static double callsZoneOne(double numberOfCallsZoneOne)
    {
        return numberOfCallsZoneOne * 1.50;
    }

    static double callsZoneTwo(double numberOfCallsZoneTwo) {
        return numberOfCallsZoneTwo * 2;
            }
        }


