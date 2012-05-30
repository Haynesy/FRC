package haynesy.filthyrichclients;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Haynesy
 * Date: 18/05/12
 * Time: 7:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinesTest  extends JComponent{

    public static void Start() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(new LinesTest());
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawLine(0, 0, 100, 100);
    }
}
