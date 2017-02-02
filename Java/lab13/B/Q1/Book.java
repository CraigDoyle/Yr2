public class Book extends LibraryItem
{
    String author, title;
    int numPages;

    public Book(String type, String ID, String author,String title, int numPages)
    {
        super(type,ID);
        this.author=author;
        this.title=title;
        this.numPages=numPages;
    }
    public void calculatePrice() {
        System.out.println("Book");

    }
    public String toString()
    {
        return type;
    }

}