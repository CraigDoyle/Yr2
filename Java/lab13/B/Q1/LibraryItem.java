public abstract class LibraryItem implements LoanItem
{
    String type, ID;

    public LibraryItem(String type, String ID)
    {
        this.type=type;
        this.ID=ID;
    }

    @Override
    public void calculatePrice() {
        System.out.println("LibraryItem");

    }

}

