package haynesy.filthyrichclients;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Haynesy
 * Date: 17/05/12
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class ManualRender extends JComponent{


    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setBackground(Color.gray);
        g2d.clearRect(0, 0, getWidth(), getHeight()); // Covers entire screen

        g2d.drawString("Woot", 100, 100);

        g2d.drawLine(10, 22, 80, 22);

        // Change the font, foreground color, and Stroke
        g2d.setFont(g.getFont().deriveFont(Font.BOLD | Font.ITALIC, 24f));
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(10f,
        BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));

        // String and line with new attributes
        g2d.drawString("New Font", 10, 50);
        g2d.drawLine(10, 57, 120, 57);
        g2d.dispose();
    }


    public static void StartApp(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setLocation(new Point(100, 100));
        JComponent app = new ManualRender();
        frame.add(app);
        //frame.pack(); // Will compress any areas not used by a layout.
        frame.setVisible(true);

    }

}
