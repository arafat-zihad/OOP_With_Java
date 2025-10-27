
import javax.swing.JFrame;

public class Main{
    public static void main(String[] args) {
        
        //JFrame is a GUI window to add components to 
        
        JFrame frame = new JFrame(); //Create a frame

        frame.setTitle("JFrame Title Gose Here"); //sets title of frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //When click button, exit out of application

        frame.setSize(420, 420); //Set the x-dimension and y-dimension of frame

        
        frame.setVisible(true); //To make frame visible

    }
}