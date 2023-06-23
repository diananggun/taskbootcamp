// import java.util.Arrays;

public class Main {
    private static float Mean(float[] numbers) {
        float sum = 0;
        for (float number : numbers) {
            sum += number;
        }
        return Math.round((sum / numbers.length) * 10) / 10f;
    }

    public static void main(String[] args) {
        float[] values = {1, 2, 3, 4};
        System.out.println(Mean(values)); // 2.5
    }
}
