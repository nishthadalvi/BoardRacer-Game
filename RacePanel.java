import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RacePanel extends JPanel implements MouseListener{

    private String color="";
    private Race r=new Race();
    public RacePanel()
    {
        addMouseListener(this);
    }
    public void paint(Graphics g)
    {
        if(!r.endGame())
        {
            TrackGraphics.paintTrack(g);
            TrackGraphics.paintDice(g,color);
            g.setColor(Color.DARK_GRAY);
            if(!r.checker("b"))
                g.fillRect(165,100,80,80);
            if(!r.checker("r"))
                g.fillRect(165,200,80,80);
            if(!r.checker("y"))
                g.fillRect(265,100,80,80);
            if(!r.checker("g"))
                g.fillRect(265,200,80,80);
            TrackGraphics.paintDieFaces(g,r.getRolled(), color);
            drawBlueDot(g);
            drawRedDot(g);
            drawYellowDot(g);
            drawGreenDot(g);
        }
        else
        {
            String winner=r.endReturner();
            if(winner.equals("y"))
            {
                g.setColor(Color.WHITE);
                g.fillRect(0,0,500,400);
                g.setColor(Color.YELLOW);
                g.drawString("Yellow Wins",215,178);
            }
            else if(winner.equals("b"))
            {
                g.setColor(Color.WHITE);
                g.fillRect(0,0,500,400);
                g.setColor(Color.BLUE);
                g.drawString("Blue Wins",215,178);
            }
            else if(winner.equals("g"))
            {
                g.setColor(Color.WHITE);
                g.fillRect(0,0,500,400);
                g.setColor(Color.GREEN);
                g.drawString("Green Wins",215,178);
            }
            else if(winner.equals("r"))
            {
                g.setColor(Color.WHITE);
                g.fillRect(0,0,500,400);
                g.setColor(Color.RED);
                g.drawString("Red Wins",215,178);
            }
        }
    }
    public void drawBlueDot(Graphics g)
    {
        g.setColor(Color.BLUE);
        int pos=r.getPlayerPos("b");
        if(pos<=4)
            g.fillOval(207-50*pos,356,10,10);
        else if(pos<=11)
            g.fillOval(7,356-50*(pos-4),10,10);
        else if(pos<=20)
            g.fillOval(7+50*(pos-11),6,10,10);
        else if(pos<=27)
            g.fillOval(457,6+50*(pos-20),10,10);
        else if(pos<=31)
            g.fillOval(457-50*(pos-27),356,10,10);
    }
    public void drawRedDot(Graphics g)
    {
        g.setColor(Color.RED);
        int pos=r.getPlayerPos("r");
        if(pos<=4)
            g.fillOval(234-50*pos,356,10,10);
        else if(pos<=11)
            g.fillOval(34,356-50*(pos-4),10,10);
        else if(pos<=20)
            g.fillOval(34+50*(pos-11),6,10,10);
        else if(pos<=27)
            g.fillOval(484,6+50*(pos-20),10,10);
        else if(pos<=31)
            g.fillOval(484-50*(pos-27),356,10,10);
    }
    public void drawYellowDot(Graphics g)
    {
        g.setColor(Color.YELLOW);
        int pos=r.getPlayerPos("y");
        if(pos<=4)
            g.fillOval(207-50*pos,383,10,10);
        else if(pos<=11)
            g.fillOval(7,383-50*(pos-4),10,10);
        else if(pos<=20)
            g.fillOval(7+50*(pos-11),33,10,10);
        else if(pos<=27)
            g.fillOval(457,33+50*(pos-20),10,10);
        else if(pos<=31)
            g.fillOval(457-50*(pos-27),383,10,10);
    }
    public void drawGreenDot(Graphics g)
    {
        g.setColor(Color.GREEN);
        int pos=r.getPlayerPos("g");
        if(pos<=4)
            g.fillOval(234-50*pos,383,10,10);
        else if(pos<=11)
            g.fillOval(34,383-50*(pos-4),10,10);
        else if(pos<=20)
            g.fillOval(34+50*(pos-11),33,10,10);
        else if(pos<=27)
            g.fillOval(484,33+50*(pos-20),10,10);
        else if(pos<=31)
            g.fillOval(484-50*(pos-27),383,10,10);
    }
    public void mousePressed(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseReleased(MouseEvent e)
    {
        if(e.getX()>=165&&e.getX()<=245&&e.getY()>=100&&e.getY()<=180)
        {
            color="b";
        }
        else if(e.getX()>=165&&e.getX()<=245&&e.getY()>=200&&e.getY()<=280)
        {
            color="r";
        }
        else if(e.getX()>=265&&e.getX()<=345&&e.getY()>=100&&e.getY()<=180)
        {
            color="y";
        }
        else if(e.getX()>=265&&e.getX()<=345&&e.getY()>=200&&e.getY()<=280)
        {
            color="g";
        }
        if(!(r.move(color).equals("\nNeed to roll a different die\n")))
            repaint();
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}
