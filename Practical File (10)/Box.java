// Java Program to print a string and a circle on Screen using java awt and swing
// By Gulshan Sharma 25599

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class Box{
    
    JFrame f = new JFrame();

    public Box(){
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(10 , 10 , 600 , 600);

    }

    public void paint(Graphics g){
        g.drawString("My name is Gulshan Sharma" , 50 , 10);
        g.setColor(Color.BLUE);
        g.drawOval(100 , 100 , 100 , 100);

    }

    public static void main(String[] args){
        Box b = new Box();
        b.f.setVisible(true);
    }
}