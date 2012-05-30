package haynesy.filthyrichclients;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

/**
 * Created with IntelliJ IDEA.
 * User: Haynesy
 * Date: 15/05/12
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class HighlightedButton extends JButton {

    static final int HIGHLIGHT_SIZE = 18;
    BufferedImage highlight = new BufferedImage(
            HIGHLIGHT_SIZE, HIGHLIGHT_SIZE, BufferedImage.TYPE_INT_ARGB);

    /**
     * Creates a new instance of HighlightedButton
     */
    public HighlightedButton(String label) {
        super(label);

        // Get the Graphics for the image
        Graphics2D g2d = highlight.createGraphics();

        // Erase the image with a transparent background
        g2d.setComposite(AlphaComposite.Clear);
        g2d.fillRect(0, 0, HIGHLIGHT_SIZE, HIGHLIGHT_SIZE);
        g2d.setComposite(AlphaComposite.SrcOver);

        // Draw the highlight
        Point2D center = new Point2D.Float((float)HIGHLIGHT_SIZE / 2.0f,
                (float)HIGHLIGHT_SIZE / 2.0f);
        float radius = (float)HIGHLIGHT_SIZE / 2.0f;
        float[] dist = {0.0f, .85f};
        Color[] colors = {Color.white, new Color(255, 255, 255, 0)};
        RadialGradientPaint paint = new RadialGradientPaint(center, radius,
                dist, colors);
        g2d.setPaint(paint);
        g2d.fillOval(0, 0, HIGHLIGHT_SIZE, HIGHLIGHT_SIZE);
        g2d.dispose();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawImage(highlight, getWidth() / 4, getHeight()/4, null);
    }
}
