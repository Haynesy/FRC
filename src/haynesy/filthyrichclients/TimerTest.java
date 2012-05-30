package haynesy.filthyrichclients;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: Haynesy
 * Date: 25/05/12
 * Time: 12:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class TimerTest {
    public static void Start() {
        boolean running = true;
        int frames = 0;
        int ticks = 0;
        long lastTimer = System.currentTimeMillis();
        LinkedList<Integer> averageFps = new LinkedList<Integer>();
        averageFps.add(0);
        averageFps.add(0);
        averageFps.add(0);
        averageFps.add(0);

        long previousTime = System.nanoTime();
        while(running){

            // Render Frame

            frames++;
            ticks++;
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

            if(ticks > 10000)
                running = false;

            if (System.currentTimeMillis() - lastTimer > 1000) {
                lastTimer += 1000;

                // Work out average
                averageFps.add(frames);
                averageFps.removeFirst();
                double average = 0.0;
                for(int frame : averageFps){
                    average += frame;
                }
                average /= 4;
                System.out.println((int)average + " fps");

                frames = 0;

            }
        }
    }
}
