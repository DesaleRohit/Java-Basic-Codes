class ImrdShirpur {
    void name() {
        System.out.println("IMRD College Shirpur...");
    }
}
class ImrdShahada extends ImrdShirpur {
    void name() {
        System.out.println("IMRD College Shahada");
    }
}
class MethodOverriding {
    public static void main(String[] args) {
        ImrdShirpur college = new ImrdShahada();
        college.name();
    }
}