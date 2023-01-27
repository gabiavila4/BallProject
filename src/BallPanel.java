import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BallPanel extends JPanel{

    int x=80;
    int y=20;
    int xSpeed=3;
    int ySpeed=3;

//array of balls
    Ball[] balls = new Ball[20];
    Ball myBall = new Ball(30, 30, 3);
    public BallPanel(){

//for loop
        for (int i = 0; i< 20; i++) {
            balls[i] = new Ball();
        }

        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int keyCode = e.getKeyCode();
                if(keyCode == 68)
                {
                    myBall.moveRight();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        setBackground(Color.lightGray);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        myBall.drawBall(g);

        g.fillOval(x, y, 20, 20);
        x+=xSpeed;
        y+=ySpeed;

        if(x>=480||x<=0){
            xSpeed*=-1;
            ySpeed*=-1;
        }
        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }


//20 ball
        for(int i = 0; i< 20; i++){
     balls[i].drawBall(g);
     balls[i].moveBall(this);
     //balls[i].setColor(Color(rC, bC, gC));
        }

        repaint();
    }
}