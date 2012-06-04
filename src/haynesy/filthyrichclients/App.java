package haynesy.filthyrichclients;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Haynesy
 * Date: 15/05/12
 * Time: 9:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class App {

    public static void main(String[] argc){
        System.out.println("Started!");

        Runnable startApp = new Runnable() {
            public void run() {

            //DrawImages.Start();

            //TimerTest.Start();
            TestTimer.Start();
            }
        };
        SwingUtilities.invokeLater(startApp);
        System.out.println("Done!");

        //JavaFramework.Play();
    }

    /**
     *  Toolkit.getDefaultToolkit().beep();
     *
     *
     */

}
