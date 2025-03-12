class One {
    public String brand = "Sizuki";
}

class Two extends One {
    public String M1 = "Ciaz";
    public String M2 = "Swift";
}

class Three extends Two {
    public String M3 = "Brezza";

    public void show() {
        System.out.println("Brand Name : " + brand);
        System.out.println("Model 1 : " + M1);
        System.out.println("Model 2 : " + M2);
        System.out.println("Model 3 : " + M3);
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {
        Three third = new Three();
        third.show();
    }
}