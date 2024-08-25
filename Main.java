import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("the EvenNumber is: %s ", middleValue(evenValues(values)));
    }

    public static int[] evenValues(int[] values) {
        return Arrays.stream(values).filter(value -> value % 2 == 0).toArray();
    }

    public static double middleValue(int[] evenValues) {
        return Arrays.stream(evenValues).average().getAsDouble();
    }
}
