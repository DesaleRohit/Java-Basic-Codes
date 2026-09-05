public class WaterBottlesLeetcode_Task {

    public static int calculateMaxBottles(int numBottles, int numExchange) {

        int totalBottles = 0;
        int emptyBottles = 0;

        while (numBottles > 0) {

            totalBottles += numBottles;
            emptyBottles += numBottles;

            numBottles = emptyBottles / numExchange;
            emptyBottles = emptyBottles % numExchange;
        }

        return totalBottles;
    }

    public static void main(String[] args) {

        int numBottles = 9;
        int numExchange = 3;

        int result = calculateMaxBottles(numBottles, numExchange);

        System.out.println("Maximum bottles drunk: " + result);
    }
}