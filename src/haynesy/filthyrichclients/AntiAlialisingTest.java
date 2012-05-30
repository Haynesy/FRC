package haynesy.filthyrichclients;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Haynesy
 * Date: 17/05/12
 * Time: 8:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class AntiAlialisingTest extends JComponent{

    Map desktopHints;
    public AntiAlialisingTest(){
        Toolkit toolKiy = Toolkit.getDefaultToolkit();
        desktopHints = (Map) toolKiy.getDesktopProperty("awt.font.desktophints");
    }

    public static void Start() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        JComponent component = new AntiAlialisingTest();
        frame.add(component);
        frame.setVisible(true);
    }
    @Override
    public void paintComponent (Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setBackground(Color.WHITE);
        g2d.clearRect(0, 0, getWidth(), getHeight());

        g2d.drawLine(0, 0, 50, 50);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.drawLine(50, 0, 100, 50);

        g2d.setColor(Color.BLACK);
        g2d.drawString("Unhinted string", 210, 220);
        if(desktopHints != null){
            g2d.addRenderingHints(desktopHints);
        }
        g2d.drawString("Hinted string", 250, 240);

    }
}
