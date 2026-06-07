import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamdemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(55);
        marks.add(74);
        marks.add(82);
        System.out.println(marks);
        List<Integer> updatedMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
        System.out.println(updatedMarks);
    }
}
