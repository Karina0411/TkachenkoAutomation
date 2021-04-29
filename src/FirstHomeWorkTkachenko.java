public class FirstHomeWorkTkachenko {
    public static void main(String[] args) {
        //1 Task. Convert Fahrenheit to Celsius
        //Formulas: Celsius = 5/9 (F - 32) Kelvin = C + 273.16
        double fahrenheitTemperature = 100;
        double celsiusTemperature = 5.0 / 9.0 * (fahrenheitTemperature - 32);
        System.out.println("For fahrenheit temperature " + fahrenheitTemperature
                + " celsius temperature is: " + celsiusTemperature);

        //2 Task. Convert Celsius to Fahrenheit
        double cel = 100;
        double fareng = (cel * 9.0 / 5.0) + 32;
        System.out.println("Temperature in Fahrenheit is: " + fareng);

        //3 Task. Convert Celsius to Kelvin
        double celsius = 100;
        double kelvin = (celsius + 273.16);
        System.out.println("For Celcius Kelvin :" + kelvin);

        // 4 Task. Convert meters to inches
        //1m = 39.37in
        double meter = 100;
        double inches = meter * 39.37;
        System.out.println("For meters " + meter + " inches are: " + inches);

        //4.1 Task. Convert inches to meters
        double inch = 100;
        double newMeter = inch / 39.37;
        System.out.println("For inches: " + inch + " meters are: " + newMeter);

        //5 Task. Convert miles to kilometres.
        //1mi = 1.609km
        double miles = 100;
        double kilometres = miles * 1.609;
        System.out.println("For miles " + miles + " kilometres are: " + kilometres);

        // 5.1 Task. Convert  kilometres to miles.
        double kms = 100;
        double mls = kms / 1.609;
        System.out.println("For kilometers miles are: " + mls);

        //6 Task. Convert kilograms to pounds.
        // 1kg = 2.2046lb
        double kg = 100;
        double lb = kg * 2.2046;
        System.out.println("Pounds are: " + lb);

        //6.1 Task. Convert Pounds to Kilograms.
        double l = 100;
        double kgm = l * 0.45;
        System.out.println("Kilograms: " + kgm);

        //7 Task. Convert speed km/hr to mi/hr.
        //1km/hr = 0.6214mi/hr
        double km = 50;
        double mi = km / 0.621;
        System.out.println("Mi/hr: " + mi);

        // 7.1 Task. Convert speed mi/hr to km/hr.
        double m = 50;
        double k = m * 1.6093;
        System.out.println("Km/hr: " + k);

        //8. Given a mark on a test and the test total, find the percentage
        double mark = 8;
        double total = 10;
        double percentage = (mark / total) * 100;
        System.out.println("Percentage is: " + percentage);

        //9. Имеем 2 переменные - возраст мужа и жены
        // Написать boolean - который возвращает true, если им обоим менее 35 лет (логические выражения и операторы сравнения), если кому то больше, то false
        int husband = 34;
        int wife = 30;
        if (husband > 35 | wife > 35) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

        //10. Получение ипотеки
        //Имеем переменную - доход семьи
        //Написать boolean - который возвращает true, если доход меньше 50000 и больше 20000

        int familyIncome = 30000;
        if (familyIncome > 20000 && familyIncome < 50000) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //11. Имеем 2 переменные - первая - наличие в магазине яблок сорта 1 вторая - наличие в магазине яблок сорта 2
        //Написать boolean - который возвращает true, если есть в наличии хотя бы один сорт
        boolean sortA = false;
        boolean sortB = true;
        Boolean purchase = sortA | sortB;
        System.out.println("Purchase is " +purchase);
    }
}


















