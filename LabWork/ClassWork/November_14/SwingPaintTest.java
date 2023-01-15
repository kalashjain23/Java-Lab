import java.awt.*;
import javax.swing.*;

public class SwingPaintTest extends JFrame{

	public SwingPaintTest(){
		super("Hello JFC");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new PaintPanel());
	}

	class PaintPanel extends JPanel{

		public void paintComponent(Graphics g){
			super.paintComponent(g);
			Dimension d = getSize();
			g.fillOval(d.width / 2 - 100, d.height / 2 - 100, 200, 200);
		}
	}

	public static void main(String[] args) throws Exception{
		SwingPaintTest app = new SwingPaintTest();
		app.setVisible(true);
	}
}
