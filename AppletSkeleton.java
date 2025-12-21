import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="AppletSkeleton" width=300 height=200>
</applet>
*/

public class AppletSkeleton extends Applet {

    public void init() {
        // runs once: initialize variables, colors, resources
        System.out.println("init() called");
    }

    public void start() {
        // runs when applet becomes active
        System.out.println("start() called");
    }

    public void stop() {
        // runs when applet becomes inactive
        System.out.println("stop() called");
    }

    public void destroy() {
        // runs once: cleanup before applet is removed
        System.out.println("destroy() called");
    }

    public void paint(Graphics g) {
        // draws output on applet window
        g.drawString("Applet Skeleton", 20, 20);
    }
}
