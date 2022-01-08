import java.awt.Color;
import java.awt.Graphics;
public class PaintDie{

    public void paintDice(Graphics g,int numRolled,String player){
        
        g.drawRect(100, 100, 800, 600);
        g.setColor(Color.BLACK);
        g.fillRect(100,100,800,600);
        g.setColor(Color.white);
        g.drawRect(200, 150, 200, 200);
        g.setColor(Color.blue);
        g.fillRect(200, 150, 200, 200);
        g.setColor(Color.white);
        g.drawRect(600, 150, 200, 200);
        g.setColor(Color.red);
        g.fillRect(600, 150, 200, 200);
        g.setColor(Color.white);
        g.drawRect(200, 450, 200, 200);
        g.setColor(Color.yellow);
        g.fillRect(200, 450, 200, 200);
        g.setColor(Color.white);
        g.drawLine(100, 100, 100, 700);
        g.drawLine(100, 100, 900, 100);
        g.drawRect(600, 450, 200, 200);
        g.setColor(Color.green);
        g.fillRect(600, 450, 200, 200);

        if(numRolled == 1) {
            if(player.equals("b")) {
                g.setColor(Color.black);
                g.drawOval(285, 235, 30, 30);
                g.fillOval(285, 235, 30, 30);
            }

            else if(player.equals("r")) {
                g.setColor(Color.black);
                g.drawOval(685, 235, 30, 30);
                g.fillOval(685, 235, 30, 30);
            }

            else if(player.equals("y")) {
                g.setColor(Color.black);
                g.drawOval(285, 530, 30, 30);
                g.fillOval(285, 530, 30, 30);
            }

            else if(player.equals("g")) {
                g.setColor(Color.black);
                g.drawOval(685, 530, 30, 30);
                g.fillOval(685, 530, 30, 30);
            }
        }

        else if(numRolled == 2) {
            if(player.equals("b")) {
                g.setColor(Color.black);
                g.drawOval(250, 200, 30, 30);
                g.fillOval(250, 200, 30, 30);
                g.drawOval(325, 275, 30, 30);
                g.fillOval(325, 275, 30, 30);
            }

            else if(player.equals("r")) {
                g.setColor(Color.black);
                g.drawOval(650, 200, 30, 30);
                g.fillOval(650, 200, 30, 30);
                g.drawOval(725, 275, 30, 30);
                g.fillOval(725, 275, 30, 30);
            }

            else if(player.equals("y")) {
                g.setColor(Color.black);
                g.drawOval(250, 500, 30, 30);
                g.fillOval(250, 500, 30, 30);
                g.drawOval(325, 575, 30, 30);
                g.fillOval(325, 575, 30, 30);
            }

            else if(player.equals("g")) {
                g.setColor(Color.black);
                g.drawOval(650, 500, 30, 30);
                g.fillOval(650, 500, 30, 30);
                g.drawOval(725, 575, 30, 30);
                g.fillOval(725, 575, 30, 30);
            }
        }



        else if(numRolled == 3) {
            if(player.equals("b")) {
                g.setColor(Color.black);
                g.drawOval(250, 200, 30, 30);
                g.fillOval(250, 200, 30, 30);
                g.drawOval(285, 237, 30, 30);
                g.fillOval(285, 237, 30, 30);
                g.drawOval(325, 275, 30, 30);
                g.fillOval(325, 275, 30, 30);
            }

            else if(player.equals("r")) {
                g.setColor(Color.black);
                g.drawOval(650, 200, 30, 30);
                g.fillOval(650, 200, 30, 30);
                g.drawOval(685, 237, 30, 30);
                g.fillOval(685, 237, 30, 30);
                g.drawOval(725, 275, 30, 30);
                g.fillOval(725, 275, 30, 30);
            }

            else if(player.equals("y")) {
                g.setColor(Color.black);
                g.drawOval(250, 500, 30, 30);
                g.fillOval(250, 500, 30, 30);
                g.drawOval(285, 537, 30, 30);
                g.fillOval(285, 537, 30, 30);
                g.drawOval(325, 575, 30, 30);
                g.fillOval(325, 575, 30, 30);
            }

            else if(player.equals("g")) {
                g.setColor(Color.black);
                g.drawOval(650, 500, 30, 30);
                g.fillOval(650, 500, 30, 30);
                g.drawOval(685, 537, 30, 30);
                g.fillOval(685, 537, 30, 30);
                g.drawOval(725, 575, 30, 30);
                g.fillOval(725, 575, 30, 30);
            }

        }

        else if(numRolled == 4) {
            if(player.equals("b")) {
                g.setColor(Color.black);
                g.drawOval(250, 200, 30, 30);
                g.fillOval(250, 200, 30, 30);
                g.drawOval(250, 275, 30, 30);
                g.fillOval(250, 275, 30, 30);
                g.drawOval(325, 200, 30, 30);
                g.fillOval(325, 200, 30, 30);
                g.drawOval(325, 275, 30, 30);
                g.fillOval(325, 275, 30, 30);
            }

            else if(player.equals("r")) {
                g.setColor(Color.black);
                g.drawOval(650, 200, 30, 30);
                g.fillOval(650, 200, 30, 30);
                g.drawOval(650, 275, 30, 30);
                g.fillOval(650, 275, 30, 30);
                g.drawOval(725, 275, 30, 30);
                g.fillOval(725, 275, 30, 30);
                g.drawOval(725, 200, 30, 30);
                g.fillOval(725, 200, 30, 30);
            }

            else if(player.equals("y")) {
                g.setColor(Color.black);
                g.drawOval(250, 500, 30, 30);
                g.fillOval(250, 500, 30, 30);
                g.drawOval(250, 575, 30, 30);
                g.fillOval(250, 575, 30, 30);
                g.drawOval(325, 500, 30, 30);
                g.fillOval(325, 500, 30, 30);
                g.drawOval(325, 575, 30, 30);
                g.fillOval(325, 575, 30, 30);
            }

            else if(player.equals("g")) {
                g.setColor(Color.black);
                g.drawOval(650, 500, 30, 30);
                g.fillOval(650, 500, 30, 30);
                g.drawOval(650, 575, 30, 30);
                g.fillOval(650, 575, 30, 30);
                g.drawOval(725, 500, 30, 30);
                g.fillOval(725, 500, 30, 30);
                g.drawOval(725, 575, 30, 30);
                g.fillOval(725, 575, 30, 30);
            }
        }

        else if(numRolled == 5) {
            if(player.equals("b")) {
                g.setColor(Color.black);
                g.drawOval(250, 200, 30, 30);
                g.fillOval(250, 200, 30, 30);
                g.drawOval(250, 275, 30, 30);
                g.fillOval(250, 275, 30, 30);
                g.drawOval(325, 200, 30, 30);
                g.fillOval(325, 200, 30, 30);
                g.drawOval(325, 275, 30, 30);
                g.fillOval(325, 275, 30, 30);
                g.drawOval(285, 237, 30, 30);
                g.fillOval(285, 237, 30, 30);
            }

            else if(player.equals("r")) {
                g.setColor(Color.black);
                g.drawOval(650, 200, 30, 30);
                g.fillOval(650, 200, 30, 30);
                g.drawOval(650, 275, 30, 30);
                g.fillOval(650, 275, 30, 30);
                g.drawOval(725, 275, 30, 30);
                g.fillOval(725, 275, 30, 30);
                g.drawOval(725, 200, 30, 30);
                g.fillOval(725, 200, 30, 30);
                g.drawOval(687, 237, 30, 30);
                g.fillOval(687, 237, 30, 30);
            }

            else if(player.equals("y")) {
                g.setColor(Color.black);
                g.drawOval(250, 500, 30, 30);
                g.fillOval(250, 500, 30, 30);
                g.drawOval(250, 575, 30, 30);
                g.fillOval(250, 575, 30, 30);
                g.drawOval(325, 500, 30, 30);
                g.fillOval(325, 500, 30, 30);
                g.drawOval(325, 575, 30, 30);
                g.fillOval(325, 575, 30, 30);
                g.drawOval(285, 537, 30, 30);
                g.fillOval(285, 537, 30, 30);
            }

            else if(player.equals("g")) {
                g.setColor(Color.black);
                g.drawOval(650, 500, 30, 30);
                g.fillOval(650, 500, 30, 30);
                g.drawOval(650, 575, 30, 30);
                g.fillOval(650, 575, 30, 30);
                g.drawOval(725, 500, 30, 30);
                g.fillOval(725, 500, 30, 30);
                g.drawOval(725, 575, 30, 30);
                g.fillOval(725, 575, 30, 30);
                g.drawOval(687, 537, 30, 30);
                g.fillOval(687, 537, 30, 30);
            }
        }

        else if(numRolled == 6)
        {
            if(player.equals("b"))
            {
                g.setColor(Color.black);
                g.drawOval(250, 200, 30, 30);
                g.fillOval(250, 200, 30, 30);
                g.drawOval(250, 275, 30, 30);
                g.fillOval(250, 275, 30, 30);
                g.drawOval(325, 200, 30, 30);
                g.fillOval(325, 200, 30, 30);
                g.drawOval(325, 275, 30, 30);
                g.fillOval(325, 275, 30, 30);
                g.drawOval(250, 237, 30, 30);
                g.fillOval(250, 237, 30, 30);
                g.drawOval(325, 237, 30, 30);
                g.fillOval(325, 237, 30, 30);
            }

            else if(player.equals("r")) {
                g.setColor(Color.black);
                g.drawOval(650, 200, 30, 30);
                g.fillOval(650, 200, 30, 30);
                g.drawOval(650, 275, 30, 30);
                g.fillOval(650, 275, 30, 30);
                g.drawOval(725, 275, 30, 30);
                g.fillOval(725, 275, 30, 30);
                g.drawOval(725, 200, 30, 30);
                g.fillOval(725, 200, 30, 30);
                g.drawOval(650, 237, 30, 30);
                g.fillOval(650, 237, 30, 30);
                g.drawOval(725, 237, 30, 30);
                g.fillOval(725, 237, 30, 30);
            }

            else if(player.equals("y")) {
                g.setColor(Color.black);
                g.drawOval(250, 500, 30, 30);
                g.fillOval(250, 500, 30, 30);
                g.drawOval(250, 575, 30, 30);
                g.fillOval(250, 575, 30, 30);
                g.drawOval(325, 500, 30, 30);
                g.fillOval(325, 500, 30, 30);
                g.drawOval(325, 575, 30, 30);
                g.fillOval(325, 575, 30, 30);
                g.drawOval(250, 537, 30, 30);
                g.fillOval(250, 537, 30, 30);
                g.drawOval(325, 537, 30, 30);
                g.fillOval(325, 537, 30, 30);
            }

            else if(player.equals("g"))
            {
                g.setColor(Color.black);
                g.drawOval(650, 500, 30, 30);
                g.fillOval(650, 500, 30, 30);
                g.drawOval(650, 575, 30, 30);
                g.fillOval(650, 575, 30, 30);
                g.drawOval(725, 500, 30, 30);
                g.fillOval(725, 500, 30, 30);
                g.drawOval(725, 575, 30, 30);
                g.fillOval(725, 575, 30, 30);
                g.drawOval(650, 537, 30, 30);
                g.fillOval(650, 537, 30, 30);
                g.drawOval(725, 537, 30, 30);
                g.fillOval(725, 537, 30, 30);
            }
        }
    }
}
