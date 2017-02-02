//Create a driver program which creates an array of LibraryItems and demonstrates the creation
  //of at least one Book and CD object in the array and calls calculatePrice on both.

public class Library
{
        public static void main (String args[])
        {
            LibraryItem[] newArray = new LibraryItem[2];

            newArray[0] = new Book("Action", "A10", "Doyle, Craig", "Safehouse", 234);
            newArray[1] = new CD("R&B", "CD10", "Eminem", "The Eminem Show", 12);

            newArray[0].calculatePrice();
            newArray[1].calculatePrice();
        }
}