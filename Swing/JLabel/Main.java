
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
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

        ImageIcon image = new ImageIcon("image.jpg");

        JLabel label1 = new JLabel(); // crate a level
        label1.setText("Arafat Islam Zihad"); // set text of lable
        label1.setBounds(10, 10, 200, 20);
        // label1.setIcon(image);
        label1.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font of text
        label1.setForeground(Color.BLUE); // Change color
        label1.setIconTextGap(55); //set gap of text to image
        // label1.setBackground(Color.BLACK); // set background color
        // label1.setOpaque(true); //display backgrond color
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