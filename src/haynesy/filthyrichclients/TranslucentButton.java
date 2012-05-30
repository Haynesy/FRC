package haynesy.filthyrichclients;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created with IntelliJ IDEA.
 * User: Haynesy
 * Date: 15/05/12
 * Time: 10:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class TranslucentButton extends JButton {


    public TranslucentButton(String label) {
        super(label);

        setOpaque(false);
    }

    BufferedImage buttonImage;
    static float alpha = 0.0f;

    @Override
    public void paint(Graphics g){

        // Initialize buttonImage
        if(buttonImage == null ||
            buttonImage.getWidth() != getWidth() ||
            buttonImage.getHeight() != getHeight()){

            buttonImage = (BufferedImage) createImage(getWidth(), getHeight());
        }

        // Get the painted graphics of button image
        Graphics gButton = buttonImage.getGraphics();
        gButton.setClip(g.getClip()); // Set clip using the current graphics clipping mask

        // paint the button
        super.paint(gButton);

        // Get a Graphics2D version of our graphics
        Graphics2D g2d = (Graphics2D)g;

        alpha += 0.01;
        // Make Alpha composite of 50% opaque
        AlphaComposite newComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha);
        g2d.setComposite(newComposite); // Set our 2D graphics to use this composite

        // redraw image
        g2d.drawImage(buttonImage, 0, 0, null);
    }

}
