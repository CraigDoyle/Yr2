public class TestPerson
{

    public static void main(String args[])
    {
        Person[] newArray = new Person[2];
        Employee employee = new Employee("Craig", 75000);
        Student student = new Student("Jonny", "Science");

        newArray[0] = employee;
        newArray[1] = student;

        System.out.println(newArray[0].getName() + " is " + newArray[0].getDescription());
        System.out.println(newArray[1].getName() + " is " + newArray[1].getDescription());
    }

}