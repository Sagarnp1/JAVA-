import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the boy's face (circle) and eyes (two circles)
        g.setColor(Color.BLUE);
        g.fillOval(150, 100, 100, 100);
        g.setColor(Color.BLACK);
        g.fillOval(170, 130, 20, 20);
        g.fillOval(210, 130, 20, 20);

        // Draw the girl's face (circle) and eyes (two circles)
        g.setColor(Color.PINK);
        g.fillOval(300, 100, 100, 100);
        g.setColor(Color.BLACK);
        g.fillOval(320, 130, 20, 20);
        g.fillOval(360, 130, 20, 20);

        // Draw lines to represent the boy looking at the girl
        g.setColor(Color.BLACK);
        g.drawLine(270, 120, 320, 120);
        g.drawLine(270, 122, 320, 122);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Main());
        frame.setVisible(true);
    }
}
