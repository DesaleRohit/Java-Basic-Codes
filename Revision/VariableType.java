class Students {
    static String college = "IMRD";  //static variable
    int rollNo;                      //instance variable
    String name;                     //instance variable

    void display() {
        int marks = 85;              //local vaiable
        System.out.println("Name :- " + name + " , " + "Marks :- " + marks);
    }
}

public class VariableType {
    public static void main(String[] args) {

        System.out.println("College Name :- "+Students.college);
        Students st = new Students();
        st.rollNo = 2;
        System.out.println("RollNo :- "+st.rollNo);
        st.name = "Ajay";
        System.out.println("Student Name :- "+st.name);
        st.display();
    }
}