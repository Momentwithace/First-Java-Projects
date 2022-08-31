package SchoolManagementSystem;

public class Course{
    private String courseName;
    private final int id;
    private static int uniqueId = 100;
    public Course(String courseName) {
        this.courseName = courseName;
        this.id = ++uniqueId;
    }

    public void setCourse(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "\nCourse>>>\n" + "Course-Name = '" + courseName +  '\'' + ", \nId = " + id ;
    }

    public int getCourseId() {
        return id;
    }
}
