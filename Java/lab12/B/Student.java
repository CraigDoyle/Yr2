public class Student extends Person
{

    int numCourses;
    String[] courses = new String [5];
    int[] grades = new int [5];


    Student(String name, String address)
    {
       // this.name = name;
        //this.address = address;
        super(name, address);
    }

    void addCourseGrade(String course, int grade)
    {
        numCourses++;
        courses[numCourses-1] = course;
        grades[numCourses-1] = grade;
    }
    double getAverageGrade()
    {
        double sum=0;
        for(int i=0;i<numCourses;i++)
        {
            sum+=grades[i];
        }

        return sum/numCourses;
    }

    public String toString()
    {
        return "Student name is " + super.getName() + " and their address is " + super.getAddress() + ".";
    }

    void printGrades()
    {
        System.out.print("Student: " +  super.toString());
        for(int i=0;i<numCourses;i++)
        {
            System.out.print(" " + courses[i] + ":" + grades[i]);
        }
        System.out.println();
    }
}