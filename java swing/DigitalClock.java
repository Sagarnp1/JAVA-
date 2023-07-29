import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JFrame {

    private JLabel timeLabel;
    private Timer timer;
    private Font clockFont;
    private Color clockColor;

    public DigitalClock() {
        setTitle("Digital Clock");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        clockFont = new Font("Arial", Font.BOLD, 50);
        clockColor = Color.WHITE;


        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {

                GradientPaint gradient = new GradientPaint(0, 0, new Color(128, 0, 128), getWidth(), getHeight(), new Color(75, 0, 130));
                ((Graphics2D) g).setPaint(gradient);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        backgroundPanel.setLayout(new BorderLayout());


        timeLabel = new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(255, 165, 0));
                g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
            }
        };
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(clockFont);
        timeLabel.setForeground(clockColor);


        backgroundPanel.add(timeLabel, BorderLayout.CENTER);


        add(backgroundPanel);


        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        });
        timer.start();
    }

    private void updateTime() {

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(new Date());


        timeLabel.setText(currentTime);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DigitalClock clock = new DigitalClock();
                clock.setVisible(true);
            }
        });
    }
}
