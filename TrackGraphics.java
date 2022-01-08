import java.awt.Color;
import java.awt.Graphics;
public class TrackGraphics{

    private static int count=0;
    static boolean canB=true;
    static boolean canR=true;
    static boolean canY=true;
    static boolean canG=true;
    public static void paintTrack(Graphics g)
    {
        for(int i=0;i<=7;i++)
        {
            g.drawRect(0,i*50,50,50);
            if (i-1 == 5)
            {
                g.setColor(Color.darkGray);
                g.fillRect(0,i*50,50,50);
                g.setColor(Color.white);
                g.drawString("-2",18,i*50+25);
                g.setColor(Color.black);
            }
        }
        for(int i=0;i<=7;i++)
        {
            g.drawRect(450,i*50,50,50);
            if (i == 1)
            {
                g.setColor(Color.darkGray);
                g.fillRect(450,i*50,50,50);
                g.setColor(Color.white);
                g.drawString("-2",450+18,i*50+25);
                g.setColor(Color.black);
            }
        }
        for(int i=0;i<=9;i++)
        {
            g.drawRect(i*50,0,50,50);
            if (i == 2)
            {
                g.setColor(Color.darkGray);
                g.fillRect(i*50,0,50,50);
                g.setColor(Color.white);
                g.drawString("-2",i*50+18,25);
                g.setColor(Color.black);
            }
        }
        for(int i=0;i<=9;i++)
        {
            g.drawRect(i*50,350,50,50);
            if (i == 7)
            {
                g.setColor(Color.darkGray);
                g.fillRect(i*50,350,50,50);
                g.setColor(Color.white);
                g.drawString("-2",i*50+18,350+25);
                g.setColor(Color.black);
            }
        }
        g.setColor(Color.CYAN);
        g.fillRect(51,51,399,299);
        g.drawLine(250,350,250,400);
    }
    public static void paintDice(Graphics g,String color)
    {
        g.setColor(Color.BLUE);
        g.fillRect(165,100,80,80);
        g.setColor(Color.RED);
        g.fillRect(165,200,80,80);
        g.setColor(Color.YELLOW);
        g.fillRect(265,100,80,80);
        g.setColor(Color.GREEN);
        g.fillRect(265,200,80,80);
    }
    public static void paintDieFaces(Graphics g,int rolled,String color)
    {
        int x=0,y=0;
        if(color.equals("b"))
        {
            x=165;
            y=100;
        }
        else if(color.equals("r"))
        {
            x=165;
            y=200;
        }
        else if(color.equals("y"))
        {
            x=265;
            y=100;
        }
        else if(color.equals("g"))
        {
            x=265;
            y=200;
        }
        g.setColor(Color.BLACK);
        if(rolled%2==1)
            g.fillOval(x+32,y+32,15,15);
        if(rolled>1&&rolled<7)
        {
            g.fillOval(x+60,y+5,15,15);
            g.fillOval(x+5,y+60,15,15);
        }
        if(rolled>3&&rolled<7)
        {
            g.fillOval(x+5,y+5,15,15);
            g.fillOval(x+60,y+60,15,15);
        }
        if(rolled==6)
        {
            g.fillOval(x+5,y+30,15,15);
            g.fillOval(x+60,y+30,15,15);
        }
    }
}