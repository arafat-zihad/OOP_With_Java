

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main{
    public static void main(String[] args) {
        
        //JFrame is a GUI window to add components to 
        
        JFrame frame = new JFrame(); //Create a frame

        frame.setTitle("JFrame Title Gose Here"); //sets title of frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //When click button, exit out of application
        
        frame.setResizable(false); // prevent frame from being resized

        frame.setSize(420, 420); //Set the x-dimension and y-dimension of frame

        frame.setVisible(true); //To make frame visible


        ImageIcon image = new ImageIcon("logo.png"); //create an imageicon
        frame.setIconImage(image.getImage()); //change icon of frame

        //background color
        // frame.getContentPane().setBackground(Color.lightGray); // change color of background
        //custom background color
        frame.getContentPane().setBackground(new Color(255, 255, 191)); // change color of background



    }
}
