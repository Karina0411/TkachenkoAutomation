package LessonFive;

public class IssOddOrEven {
    public static void main(String[] args) {

        boolean isIntegerEven = isEven(12);
        System.out.println(" Integers is Even " + isIntegerEven);

    }

    static boolean isEven(int input) {
        if (input % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
