import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RaceGraphics extends JFrame
{
    private static final long serialVersionUID = 1L;
    private static final int WIDTH = 1200;
    private static final int HEIGHT = 1000;
    public RaceGraphics(String frameName)
    {
        super(frameName);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);  
        add(new RacePanel());
        setVisible(true);
    }
    public static void main(String args[])
    {
        RaceGraphics game = new RaceGraphics("Race");
    }
}
