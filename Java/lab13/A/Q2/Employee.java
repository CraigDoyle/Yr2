public class Employee extends Person
{
    private double annualSalary;

    public Employee(String name, double s)
    {
        super(name);
        setAnnualSalary(s);

    }

    public void setAnnualSalary(double s)
    {
        annualSalary = s;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return "an Employee with an annual salary of " + annualSalary;
    }
}
