package HomeWorkSix;

public class MobileBill {
    //Рассчитать стоимость пакета в месяц.
    //Расчёт по каждому из параметров сделать в отдельном методе.
    //Потом общий подсчёт провести в методе main и вывести в консоль c помощью sout
    //1. Стоимость интернета до 8гб включена в пакет, после 50 грн / 500 мб (вход параметр кол-во потраченных гб)
    //2. Звонки по Украине до 500 минут 0,5 грн / мин после 0,75
    //3. Смс до 50 шт 1 грн после 1,50
    //4.Звонки за рубеж зона 1 1.5 грн/мин
    //5.Звонки за рубеж зона 2 2 грн/мин
    //После подсчёта суммы добавляется налог 7 %

     double spentGB = 8.0;

     public double calculateInternet() {
        if (spentGB <= 8) return 0;
        else return (spentGB - 8) * 1024 * 0.1;
    }

     double ukraineMinute = 500.0;

     public double calculateUkrCall() {
        if (ukraineMinute <= 500) return (ukraineMinute * 0.5);
        else return 500 * 0.5 + (ukraineMinute - 500) * 0.75;

    }

     double sms = 51.0;

     public double calculateSms() {
        if (sms <= 50) return (sms * 1);
        else return 50 * 1 + (sms - 50) * 1.50;
    }

     double numberOfCallsZoneOne = 10;

     public double calculeteFirstZone()  {
        return numberOfCallsZoneOne * 1.50;
    }

     double numberOfCallsZoneTwo = 10;

     public double calculateSecondZone() {
        return numberOfCallsZoneTwo * 2;
    }
}
