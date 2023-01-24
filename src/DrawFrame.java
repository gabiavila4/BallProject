import javax.swing.*;
import java.awt.*;

public class DrawFrame
{
    public static void main(String[] args)
    {

        JFrame myFrame = new JFrame();
        myFrame.setSize(500, 500);
        drawPanel myPanel = new drawPanel();
        BallPanel myBPanel = new BallPanel();
        // Ball myB = new Ball();

        myFrame.add(myBPanel);
        myFrame.setVisible(true);
    }

}
