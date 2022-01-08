public class Player
{
    private int spot=0,count=0,rolled;
    private String color;
    private Die d;
    public Player(String s)
    {
        color=s;
        d=new Die(color);
    }
    public String moveForward()
    {
        count++;
        rolled=d.roll();
        spot+=rolled;
        return "\nRolled:"+rolled;
    }
    public String getColor()
    {
        return color;
    }
    public int getSpot()
    {
        return spot;
    }
    public int getCount()
    {
        return count;
    }
    public int getRolled()
    {
        return rolled;
    }
    public String getFullColor()
    {
        return full;
    }
    public void setPos(int pos)
    {
        spot = pos;
    }
}
