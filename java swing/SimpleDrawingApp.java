import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.*;

public class SimpleDrawingApp extends JFrame {

    private JPanel drawingPanel;
    private Color currentColor = Color.BLACK;
    private int currentThickness = 1;
    private boolean isDrawing = false;
    private int prevX, prevY;

    public SimpleDrawingApp() {
        setTitle("Simple Drawing App");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                drawOnPanel(g);
            }
        };
        drawingPanel.setBackground(Color.WHITE);

        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                isDrawing = true;
                prevX = e.getX();
                prevY = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                isDrawing = false;
            }
        });

        drawingPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (isDrawing) {
                    drawOnPanel(drawingPanel.getGraphics());
                    prevX = e.getX();
                    prevY = e.getY();
                }
            }
        });

        JPanel controlsPanel = new JPanel();
        controlsPanel.setLayout(new FlowLayout());

        JButton colorButton = new JButton("Choose Color");
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentColor = JColorChooser.showDialog(null, "Choose Color", currentColor);
            }
        });

        JButton eraseButton = new JButton("Erase");
        eraseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentColor = drawingPanel.getBackground();
            }
        });

        JSlider thicknessSlider = new JSlider(JSlider.HORIZONTAL, 1, 20, currentThickness);
        thicknessSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                currentThickness = thicknessSlider.getValue();
            }
        });

        controlsPanel.add(colorButton);
        controlsPanel.add(eraseButton);
        controlsPanel.add(new JLabel("Line Thickness:"));
        controlsPanel.add(thicknessSlider);

        setLayout(new BorderLayout());
        add(drawingPanel, BorderLayout.CENTER);
        add(controlsPanel, BorderLayout.SOUTH);
    }


    private void drawOnPanel(Graphics g) {
        System.out.println("MADE BY DON");
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(currentColor);
        g2d.setStroke(new BasicStroke(currentThickness));
        g2d.drawLine(prevX, prevY, drawingPanel.getMousePosition().x, drawingPanel.getMousePosition().y);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleDrawingApp app = new SimpleDrawingApp();
                app.setVisible(true);
            }
        });
    }
}
