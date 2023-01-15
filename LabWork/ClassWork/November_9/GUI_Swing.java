import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingExample extends JFrame implements WindowListener{
    SwingExample() {
        setTitle("First Swing Welcome Page");
        setSize(400, 400);
        setBackground(new Color(255, 0, 0));
        // setContentPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        addWindowListener(this);
    }

    public void windowClosing(WindowEvent e){
        System.out.println("Window Closing");
    }    

    public void windowClosed(WindowEvent e){
        System.out.println("Window Closed");
    }

    public void windowOpened(WindowEvent e){
        System.out.println("Window Opened");
    }

    public void windowIconified(WindowEvent e){
        System.out.println("Window Iconified");
    }

    public void windowDeiconified(WindowEvent e){
        System.out.println("Window Deiconified");
    }

    public void windowActivated(WindowEvent e){
        System.out.println("Window Activated");
    }

    public void windowDeactivated(WindowEvent e){
        System.out.println("Window Deactivated");
    }
    // public void paint(Graphics g){
    //     g.setColor(Color.BLUE);
    //     g.setFont(new Font("Arial", Font.BOLD, 22));
    //     g.drawString("Welcome to Java-GUI World", 100, 100);
    //     g.setColor(new Color(255, 0, 0));
    //     g.drawLine(50, 130, 150, 130);
    // }

}

public class GUI_Swing{
    public static void main(String[] args) {
        SwingExample f1 = new SwingExample();
    }
}
