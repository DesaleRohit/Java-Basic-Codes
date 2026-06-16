interface Address {
    void displayAddress();
}

class HomeAddress implements Address {
    public void displayAddress() {
        System.out.println("Home: Mumbai");
    }
}

class OfficeAddress implements Address {
    public void displayAddress() {
        System.out.println("Office: Pune");
    }
}

class Emp {
    private Address address;

    Emp(Address address) {     // Dependency Injection
        this.address = address;
    }

    void showEmployee() {
        System.out.println("Employee Details");
        address.displayAddress();
    }
}

public class LooselyCouplingExample {
    public static void main(String[] args) {

        Address home = new HomeAddress();
        Emp e1 = new Emp(home);
        e1.showEmployee();

        Address office = new OfficeAddress();
        Emp e2 = new Emp(office);
        e2.showEmployee();
    }
}