package LessonFive;

public class SumTwoValues {
    public static void main(String[] args) {

        System.out.println(sumThreeValues(5, 7, 12));
    }

    /**metod for sum 3 values
     * @param i1 - first vvalue
     * @param i2 - second value
     * @param i3 - third value
     * @return - sum of the values
     */
    static int sumThreeValues(int i1, int i2, int i3){
        int sum = i1 +i2 + i3;
        return  sum;
    }
}
