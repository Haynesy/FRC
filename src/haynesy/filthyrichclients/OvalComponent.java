package haynesy.filthyrichclients;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Haynesy
 * Date: 15/05/12
 * Time: 9:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class OvalComponent extends JComponent {
    public void paintComponent(Graphics g){

        // Background
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());

        // Oval
        g.setColor(Color.GRAY);
        g.fillOval(0, 0, getWidth(), getHeight());
    }
}
