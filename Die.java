public class Die
{
    private String color;
    public Die(String s)
    {
        color=s;
    }
    public int roll()
    {
        return (int)(Math.random()*6)+1;
    }
    public String getColor()
    {
        return color;
    }
}
