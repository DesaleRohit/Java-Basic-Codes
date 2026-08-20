import java.util.Arrays;

public class MedianOfArray {

    public static double findMedian(int[] numbers) {

        Arrays.sort(numbers);

        int length = numbers.length;

        if (length % 2 != 0) {
            return numbers[length / 2];
        }

        return (numbers[length / 2 - 1] + numbers[length / 2]) / 2.0;
    }

    public static void main(String[] args) {

        int[] numbers = { 5, 2, 8, 1, 3 };

        double median = findMedian(numbers);

        System.out.println("Median = " + median);
    }
}