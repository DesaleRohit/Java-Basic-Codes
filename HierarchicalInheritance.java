class Student {
    public int id;
    public String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showStudent() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }
}

class Internal extends Student {
    public int i_Java;
    public int i_Ds;

    public Internal(int id, String name, int i_Java, int i_Ds) {
        super(id, name);
        this.i_Java = i_Java;
        this.i_Ds = i_Ds;
    }

    public void showInternal() {
        showStudent();
        System.out.println("Java Internal Marks : " + i_Java);
        System.out.println("Ds Internal Marks : " + i_Ds);
    }
}

class External extends Student {
    public int E_Java;
    public int E_Ds;

    public External(int id, String name, int E_Java, int E_Ds) {
        super(id, name);
        this.E_Java = E_Java;
        this.E_Ds = E_Ds;
    }

    public void showExternal() {
        showStudent();
        System.out.println("Java External Marks : " + E_Java);
        System.out.println("Ds External Marks : " + E_Ds);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Internal internal = new Internal(1, "Rohit", 50, 65);
        internal.showInternal();

        External external = new External(1, "Rohit", 98, 85);
        external.showExternal();
    }
}
