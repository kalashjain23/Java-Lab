/* Write a program to create simple JFrame having title "Welcome Java-GUI" and background color of frame
has to be blue. */

import javax.swing.*;
import java.awt.*;

public class Ques1 extends JFrame
{
    public Ques1()
    {
        super("Welcome Java-GUI");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.blue);
    }

    public static void main(String[] args)
    {
        new Ques1();
    }
}
