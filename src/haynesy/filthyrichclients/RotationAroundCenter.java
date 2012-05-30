package haynesy.filthyrichclients;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Haynesy
 * Date: 18/05/12
 * Time: 4:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class RotationAroundCenter extends JComponent {


    public static void Start() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JComponent test = new RotationAroundCenter();
        frame.add(test);
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g.create();

        // Fill background
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Base rectangle
        g2d.setColor(Color.GRAY.brighter());
        g2d.fillRect(50, 50, 50, 50);

        // Rotate 45 degrees around world origin
        g2d.rotate(Math.toRadians(45));
        g2d.setColor(Color.GRAY.brighter());
        g2d.fillRect(50, 50, 50, 50);

        // Rotate 45 degrees around world origin
        g2d = (Graphics2D) g.create();
        g2d.rotate(Math.toRadians(45), 75, 75);
        g2d.setColor(Color.BLACK);
        g2d.fillRect(50, 50, 50, 50);

        g2d.dispose();
    }
}
