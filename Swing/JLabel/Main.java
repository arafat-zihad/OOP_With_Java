
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main{
    public static void main(String[] args) {
        //Jlabel = a GUI display area for a string of text, an image, or both

        //Before making lable we need JFrame
        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setTitle("My Info");

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // frame.setLayout(new FlowLayout());
        frame.setLayout(null);

        JLabel label1 = new JLabel();
        label1.setText("Arafat Islam Zihad");
        label1.setBounds(10, 10, 150, 20);
        frame.add(label1);

        JLabel label2 = new JLabel();
        label2.setText("ID: 241-115-052");
        label2.setBounds(10, 30, 150, 20);
        frame.add(label2);

        JLabel label3 = new JLabel();
        label3.setText("Bsc in CSE");
        label3.setBounds(10, 50, 80, 20);
        frame.add(label3);

        frame.setVisible(true);
    }
}