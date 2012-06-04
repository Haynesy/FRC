package haynesy.filthyrichclients;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Haynesy
 * Date: 1/06/12
 * Time: 8:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestTimer {
    private static int WIDTH = 800;
    private static int HEIGHT = 600;
    private static boolean running  = true;

    private static Random random = new Random();

    private static BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    private static int[] pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();



    public static void Start() {

        System.out.println("Timer Started");

        long previousTime = System.currentTimeMillis();
        //long timer = previousTime;

        int counter = 0;

        while(running){

            if(counter > 5)
                running = false;

            long currentTime = System.currentTimeMillis();
            if(currentTime - previousTime > 1000){

                counter++;
                System.out.println("Tick");

                previousTime = currentTime;
            }

        }
        System.out.println("Timer Finished!");


    }
}
