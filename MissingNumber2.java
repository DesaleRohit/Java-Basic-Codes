public class MissingNumber2 {

    public static void main(String[] args) {
        int[] arr = { 3, 0, 2, 5, 1, 6 };

        int n = arr.length;

        int expectedSum = n * (n + 1) / 2;

        System.out.println("Expected sum : " + expectedSum);

        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
        }

        System.out.println("Current sum : " + currentSum);

        int missingNum = expectedSum - currentSum;

        System.out.println("Missing number is : " + missingNum);

    }
}
