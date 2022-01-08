public class Track {
    
    private Tile[] tiles;
    public Track()
    {
        tiles=new Tile[32];
        for(int i=0;i<32;i++)
            tiles[i]=new Tile(i);
    }
    public void setTile(String s,int i)
    {
        if(i<32)
            tiles[i].getOn(s);
    }
    public Tile[] getTiles()
    {
        return tiles;
    }
}
