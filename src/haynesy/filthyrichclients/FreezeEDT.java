package haynesy.filthyrichclients;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: Haynesy
 * Date: 16/05/12
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class FreezeEDT extends JFrame implements ActionListener {

    JButton freezer;

    public FreezeEDT(){
        super("Freeze");
        freezer = new JButton("Freeze");
        freezer.addActionListener(this);
        add(freezer);
        pack();
    }

    public void actionPerformed(ActionEvent e) {
        // Blocks the Event Dispatch Thread (EDT)
        /**
        try {
            System.out.println("Thread Sleep");
            Thread.sleep(4000);
            System.out.println("Thread Wake");
        }catch(InterruptedException ex ){
            System.out.println("Exception");
        }
        **/

        // Start new thread to handle request
        new Thread(new Runnable(){
            public void run(){

                final String text = "Foo";

                try {
                    System.out.println("Thread Sleep");
                    Thread.sleep(4000);
                    System.out.println("Thread Wake");
                }catch(InterruptedException ex ){
                    System.out.println("Exception");
                }

                // Place the action onto the edit to be finalized later
                SwingUtilities.invokeLater(new Runnable(){
                    public void run(){
                        freezer.setLabel(text);
                    }
                });
            }
        }).start();
    }
}
