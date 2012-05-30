package haynesy.filthyrichclients;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Haynesy
 * Date: 16/05/12
 * Time: 8:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class SafeComponent extends JLabel {
    public SafeComponent(){
        super("Safe Repaint");
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        System.out.println(SwingUtilities
            .isEventDispatchThread());
    }
}
