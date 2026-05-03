public class Encapsualtion2 {

    private int id;
    private String name;

    public Encapsualtion2() {
    }

    public Encapsualtion2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encapsualtion2 obj = new Encapsualtion2(1, "Nayan");

        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}