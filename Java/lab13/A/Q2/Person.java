public abstract class Person
{
    String name;

    public Person(String name)
    {
        this.name = name;
    }

    public abstract String getName();
    public abstract String getDescription();
    public String toString()
    {
        return ("---\nPerson Name = " + this.name);
    }

}