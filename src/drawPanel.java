import javax.swing.*;
import java.awt.*;
public class drawPanel extends JPanel{


        //variables constructors methods

        public drawPanel()
        {
            setBackground(Color.GREEN);
        }

        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.fillOval(100, 200, 100, 100);
            //g.getColor
        }
    }

