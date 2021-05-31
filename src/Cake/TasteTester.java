package Cake;

public class TasteTester {

    public static void main(String[] args) {

        Cake cake = new Cake();
        cake.setTaste("Sweet");
        cake.setPrice(250.50);

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setCandles(25);

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setTier(7);

        System.out.println(cake.getTaste());
        System.out.println(cake.getPrice());
        System.out.println(birthdayCake.getCandles());
        System.out.println(weddingCake.getTier());
    }
}
