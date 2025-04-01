import java.awt.*;
public class FrameDemo1 extends Component {

    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(500,500);
        f.setLocation(50,50);
        f.setTitle("My First Frame");
        f.setVisible(true);
    }
}