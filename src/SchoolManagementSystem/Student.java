package SchoolManagementSystem;


import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private final int id;
    private static int uniqueId = 1000;
    private String studentFirstName;
    private String studentSecondName;
    private String studentGender;
    private int studentAge;
    private ArrayList<Course> courses;
    



    public Student(String studentFirstName, String studentSecondName, String studentGender, int studentAge) {
        this.id = ++uniqueId;
        this.studentFirstName = studentFirstName;
        this.studentSecondName = studentSecondName;
        this.studentGender = studentGender;
        this.studentAge = studentAge;
        this.courses = new ArrayList<>();
        
    }

    public void setFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getFirstName() {
        return studentFirstName;
    }

    public void setSecondName(String studentSecondName) {
        this.studentSecondName = studentSecondName;
    }

    public String getSecondName() {
        return studentSecondName;
    }

    public void setGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getGender() {
        return studentGender;
    }

    public void setAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getAge() {
        return studentAge;
    }

    public void addCourse(Course course) {
       // Course newCourse = new Course(courseName);
        courses.add(course);
    }
    public void addCourse(String courseName) {
        Course newCourse = new Course(courseName);
        courses.add(newCourse);
    }

    public Course getCourse(String courseName) throws Exception {
        for (Course course : courses) {
            if(Objects.equals(course.getCourseName(), courseName)){
                return course;

            }

        }
        throw new Exception("Course Not Found");
    }

    public void dropCourse(String courseName) throws Exception {
        int initialArraySize = courses.size();
        for(Course course : courses){
            if(Objects.equals(course.getCourseName(), courseName)){
                courses.remove(course);
                break;
            }
        }
        if (initialArraySize == courses.size()){
            throw new Exception("Course Not Found!!!");
        }
    }

    public ArrayList<Course> getCourseList() {
        return courses;
    }

    public int studentId() {
        return id;
    }
}
