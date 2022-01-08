public class Race{

    private Player[] players;
    private Track t;
    private int rolled=0;
    public Race()
    {
        t=new Track();
        players=new Player[4];
        players[0]=new Player("r");
        players[1]=new Player("b");
        players[2]=new Player("g");
        players[3]=new Player("y");
    }
    public boolean checker(String s)
    {
        int low=Integer.MAX_VALUE;
        for(int i=0;i<players.length;i++)
        {
            if(players[i].getColor().equals(s))
            {
                for(Player q : players)
                {
                    if(low>q.getCount())
                        low=q.getCount();
                }
                return players[i].getCount()==low;
            }
            low=Integer.MAX_VALUE;
        }
        return false;
    }
    public String move(String s)
    {
        for(int i=0;i<players.length;i++)
        {
            if(players[i].getColor().equals(s))
            {
                if(checker(s))
                {
                    String str=players[i].moveForward();
                    if(!t.getTiles()[players[i].getSpot()].getDirection())
                        players[i].setPos(players[i].getSpot()-2);    
                    t.setTile(players[i].getColor(),players[i].getSpot());
                    rolled=players[i].getRolled();
                    if(players[i].getSpot()<31)
                        str+=" "+players[i].getColor()+" Position:"+players[i].getSpot()+"\n";
                    for(Player m : players)
                    {
                        for(int n=0;n<m.getSpot();n++)
                            str+=" ";
                        str+=m.getColor()+"\n";
                    }
                    return str;
                }
                else
                {
                    return "\nNeed to roll a different die\n";
                }
            }
        }
        return "\nNo player found\n";
    }
    public int getPlayerPos(String s)
    {
        for(int i=0;i<players.length;i++)
        {
            if(players[i].getColor().equals(s))
            {
                return players[i].getSpot();
            }
        }
        return -1;
    }
    public int getRolled()
    {
        return rolled;
    }
    public boolean endGame()
    {
        for(Player p : players)
        {
            if(p.getSpot()>=31)
            {
                return true;
            }
        }
        return false;
    }
    public String endReturner()
    {
        for(Player p : players)
        {
            if(p.getSpot()>=31)
                return p.getColor();
        }
        return "";
    }
}
