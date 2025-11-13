
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Lecture 8
public class Swing1{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        frame.setTitle("Information");
        frame.setLocationRelativeTo(null);
        frame.setLayout(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel();

		label1.setText("Name: ");

		label1.setBounds(10, 10, 150,20);

		frame.add(label1);

		

		JTextField tf1 = new JTextField();

		tf1.setBounds(60, 10, 150, 25);

		frame.add(tf1);

		

		JLabel label2 = new JLabel();

		label2.setText("Id: ");

		label2.setBounds(10,40,150,20);

		frame.add(label2);



		JTextField tf2 = new JTextField();

		tf2.setBounds(60, 40, 150, 25);

		frame.add(tf2);

		

		

		JLabel label3 = new JLabel();

		label3.setText("Batch: ");

		label3.setBounds(10,70,150,20); 

		frame.add(label3);

		

		JTextField tf3 = new JTextField();

		tf3.setBounds(60, 70, 150, 25);

		frame.add(tf3);


        frame.setVisible(true);
    }
}




// import javax.swing.JFrame;
// import javax.swing.JLabel;

// public class Swing1{
//     public static void main(String[] args) {
        
//         JFrame frame = new JFrame();
//         frame.setSize(500, 400);
//         frame.setTitle("My Info");
//         frame.setLocationRelativeTo(null);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         // frame.setLayout(new FlowLayout());
//         frame.setLayout(null);

//         JLabel label1 = new JLabel();
//         label1.setText("Metropolitan University");
//         label1.setBounds(10, 10, 150, 20);
//         frame.add(label1);

//         JLabel label2 = new JLabel();
//         label2.setText("Arafat Islam Zihad");
//         label2.setBounds(10, 30, 150, 20);
//         frame.add(label2);


//         frame.setVisible(true);

//     }
// }