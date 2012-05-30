package haynesy.filthyrichclients;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.Raster;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Haynesy
 * Date: 22/05/12
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class DrawImages extends JComponent
{
    private static Random random;
    public DrawImages()
    {

    }

    public static void Start() {

        random = new Random();
        random.setSeed(System.nanoTime());
        System.out.println(random.nextInt(255));
        System.out.println(random.nextInt(255));
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DrawImages());
        frame.pack();
        frame.setSize(500, 500);
        frame.setVisible(true);
        //To change body of created methods use File | Settings | File Templates.
    }

    public void paintComponent(Graphics g){
        //Graphics2D graphics2D = (Graphics2D) graphics.create();

        BufferedImage bImg = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bImg.getGraphics();
        //graphics.setColor(Color.LIGHT_GRAY);
        //graphics.fillRect(0, 0, 500, 500);

        //g.drawImage(bImg, 0, 0, null);
        long managedTime = copyImage(g, bImg, 0, 0);
        System.out.println("Managed Time: " + managedTime + " ms");

        Raster raster = bImg.getRaster();
        DataBufferInt dataBuffer = (DataBufferInt)raster.getDataBuffer();
        int pixels[] = dataBuffer.getData();

        for(int i = 0; i < pixels.length; ++i){
            pixels[i] = random.nextInt(255); // TODO work out why it is not getting a new int each time
            //if(i % 10000 == 0)
                //System.out.println(i);

        }

        long unmanagedTime = copyImage(g, bImg, 500, 0);
        System.out.println("Unmanaged Time: "+ unmanagedTime + " ms");
    }

    public long copyImage(Graphics g, BufferedImage image, int x, int y)
    {

        long startTime = System.nanoTime();
        for(int i = 0; i < 10; ++i){
            g.drawImage(image, x, y, null);
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }
}
