import javax.swing.*;
import java.awt.*;
public class Ball extends JPanel{

    private int x, y, size, xSpeed, ySpeed;

    //public Ball(int x, int y, int size){ this.x = x; this.y = y; this.size = size;}

    public Ball(int inX, int inY, int inSize)
    {
        // x = (int)(Math.random()*380 + 2);
        //y = (int)(Math.random()*380 + 2);
       // radius = (int)(Math.random()*41+10);
      //  size = 2 * radius;
        //col = Color.RED;
       // xAdd = 1;
        x = inX;
        y = inY;
        size = inSize;

        xSpeed = (int)(Math.random()*10);
        ySpeed = (int)(Math.random()*10);
    }

    public void moveRight(){
        x = x + 3;
    }

    public void moveUp()
    {
        y = y-1;
    }

    public void drawBall(Graphics g){

        g.fillOval(x, y, size, size);
    }


}
