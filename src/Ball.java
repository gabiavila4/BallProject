import javax.swing.*;
import java.awt.*;
public class Ball extends JPanel{

    private int x, y, size, xSpeed, ySpeed, rC, bC , gC;

    //public Ball(int x, int y, int size){ this.x = x; this.y = y; this.size = size;}

    public Ball()
    {
       x = (int)(Math.random()*500) + 1;
       y = (int)(Math.random()*500)+ 1;
       size = (int)(Math.random()*30) + 15;
       xSpeed = (int)(Math.random()*10)+ 1;
       ySpeed = (int)(Math.random()*10)+ 1;
       rC = (int)(Math.random()*254) + 1;
       bC = (int)(Math.random()*254) + 1;
       gC = (int)(Math.random()*254) + 1;
    }
    public Ball(int inX, int inY, int inSize)
    {

        x = inX;
        y = inY;
        size = inSize;

        xSpeed = (int)(Math.random()*10);
        ySpeed = (int)(Math.random()*10);
    }

    public void moveRight(){
        x = x + 3;
    }

    public void moveBall(JPanel panel){
        x+= xSpeed;
        y+=ySpeed;

        if (x>= panel.getWidth() - size || x<=0)
        {
            xSpeed *= -1;

            //making random angles
            if (ySpeed < 0){
                ySpeed = (int)(Math.random()*20)+ 1;
                ySpeed *= -1;
            }else
            {
                ySpeed = (int)(Math.random()*20)+ 1;
            }

        }else if (y>= panel.getHeight()- size || y<=0){
            ySpeed *= -1;


            if (xSpeed < 0){
                xSpeed = (int)(Math.random()*20)+ 1;
                xSpeed *= -1;
            }else
            {
                xSpeed = (int)(Math.random()*20)+ 1;
            }
        }



    }
// attempt at bouncing balls off each other
    public void collide(){
    xSpeed*=-1;
    ySpeed*=-1;
    }
    public void moveUp()
    {
        y = y-1;
    }

    public void drawBall(Graphics g){

        g.fillOval(x, y, size, size);
        Color newC = new Color(rC, bC, gC);
        g.setColor(newC);
    }


}
