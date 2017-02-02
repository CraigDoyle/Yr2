public class Teacher extends Person
{

    int numCourses;
    String[] courses = new String [10];



    Teacher(String name, String address)
    {
        // this.name = name;
        //this.address = address;
        super(name, address);
    }

    boolean addCourse(String course)
    {
        numCourses++;
        for (int i = 0; i < numCourses; i++)
        {
            if (courses[i] == null)
            {
                courses[numCourses - 1] = course;
                return true;
            }

        }
        return false;
    }
    boolean removeCourse(String course)
    {
        int place=-1;
        for(int i=0;i<numCourses;i++)
        {
            if(courses[i].equals(course))
            {
                place=i;
            }
        }
        if(place==-1)
        {
            return false;
        }
        else {

            for (int i = place; i < numCourses - 1; i++)
            {
                courses[i] = courses[i + 1];
            }
        }
        return true;
    }
    public String toString()
    {
        return "Teacher : " + super.getName() + " " + super.getAddress() ;
    }
}