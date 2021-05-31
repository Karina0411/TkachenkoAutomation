package JuicePac;
//    //В этом классе добавьте поле int “сalories” для него setCalories() и getCalories а также
//    //метод makeJuice(), который печатает в консоль - "сок сделан" (общее сообщение).
public class Fruit {
    public int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void JuiceMaker(){
        System.out.println("Juice is ready");
    }
}


