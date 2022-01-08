import java.util.ArrayList;
public class Tile {
    private int pos;
    private boolean direction;
    ArrayList<String> onTile=new ArrayList<>();
    public Tile(int p)
    {
        pos=p;
        if (p==5 || p==13 || p==21 || p==29)
            direction = false;
        else
            direction = true;
    }
    public void getOn(String s)
    {
        onTile.add(s);
    }
    public int getPos()
    {
        return pos;
    }
    public boolean getDirection() 
    {
        return direction;
    }
    public ArrayList<String> whosOn(Player p)
    {
        return onTile;
    }
}
