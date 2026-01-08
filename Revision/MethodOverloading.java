class Calculation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
class MethodOverloading {
    public static void main(String[] args) {
        Calculation cal = new Calculation();

        System.out.println(cal.add(10, 20));
        System.out.println(cal.add(10.5, 5.5));
        System.out.println(cal.add(1, 2, 3));
    }
}