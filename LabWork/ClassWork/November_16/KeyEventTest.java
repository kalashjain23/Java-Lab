package November_16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class KeyEventTest extends JFrame implements KeyListener {
    int x = 0;
    int y = 0;
    public KeyEventTest(){
        setTitle("KeyEvent handling");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(new ObjectDraw());
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        if (keyEvent.getKeyChar() == 'R' || keyEvent.getKeyChar() == 'r'){
            System.out.println("right");
            x = x+10;
            repaint();
        }
        if (keyEvent.getKeyChar() == 'L' || keyEvent.getKeyChar() == 'l'){
            System.out.println("left");
            x = x-10;
            repaint();
        }
        if (keyEvent.getKeyChar() == 'U' || keyEvent.getKeyChar() == 'u'){
            System.out.println("up");
            y = y-10;
            repaint();
        }
        if (keyEvent.getKeyChar() == 'D' || keyEvent.getKeyChar() == 'd'){
            System.out.println("down");
            y = y+10;
            repaint();
        }
    }

    public void keyPressed(KeyEvent keyEvent) {

    }

    public void keyReleased(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT){
            System.out.println("right");
            x = x+10;
            repaint();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT){
            System.out.println("left");
            x = x-10;
            repaint();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_UP){
            System.out.println("up");
            y = y-10;
            repaint();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN){
            System.out.println("down");
            y = y+10;
            repaint();
        }

    }

    class ObjectDraw extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.BLUE);
            g.fillRect(x,y,40,40);

        }
    }

    public static void main(String[] args) {
        KeyEventTest l = new KeyEventTest();
    }
}