public class CD extends LibraryItem
{
    String band, title;
    int numTracks;


    public CD(String type, String ID, String band, String title, int numTracks)
    {
        super(type,ID);
        this.band=band;
        this.title=title;
        this.numTracks=numTracks;
    }
    public void calculatePrice() {
        System.out.println("CD");

    }
    public String toString()
    {
        return type;
    }

}