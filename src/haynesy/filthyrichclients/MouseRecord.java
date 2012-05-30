package haynesy.filthyrichclients;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: Haynesy
 * Date: 21/05/12
 * Time: 5:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class MouseRecord extends JComponent {

    public MouseRecord()
    {
        addMouseListener(new MouseListener() {
            public int LEFT_CLICK = 1;
            public int RIGHT_CLICK = 3;

            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked "+ e.getButton());
            }

            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed "+ e.getButton());
            }

            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse released "+ e.getButton());
            }

            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered ");
            }

            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse exited ");
            }
        });
    }

    public static void Start() {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.add(new MouseRecord());
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics graphics){

        URL url = null;
        try {
            url = new URL("https://localhost/Content/logos/fglogo.png");
            System.out.println("Loaded!");
        } catch (MalformedURLException e) {
            System.out.println(":( Bad URL Thingy: " + e.getMessage());
        }
        Graphics2D graphics2D = (Graphics2D) graphics.create();
        Image image = Toolkit.getDefaultToolkit().getImage(url);

        // TODO: Not working

        graphics2D.drawImage(image, 0, 0, null);
    }


}
