public class Leetcode_1491_Average_Salary {
    public static double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = 0;

        for (int s : salary) {
            sum += s;
            min = Math.min(min, s);
            max = Math.max(max, s);
        }

        return (double) (sum - min - max) / (salary.length - 2);
    }

    public static void main(String[] args) {

        int[] salary = { 4000, 3000, 1000, 2000 };

        double result = average(salary);

        System.out.println("Average Salary: " + result);
    }

}
