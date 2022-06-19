package Chapter8.SchoolManagementSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class School {
    private String schoolName;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void createSchoolName(String schoolName) {
        this.schoolName = schoolName;

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void addCourseToSchool(String courseName) {
        Course newCourse = new Course(courseName);
        courses.add(newCourse);
    }

    public Course getCourse(String courseName) throws Exception {
        int initialArraySize = courses.size();
        for(Course course : courses){
            if(Objects.equals(course.getCourseName(), courseName)){
                return course;

            }
        }
        if(initialArraySize == courses.size()){
            throw new Exception("Course Not Found!!!");
        }

        return null;
    }

    public ArrayList<Course> getListOfCourse() {
        return courses;

    }

    public void addStudent(Student newStudent) {
      //  Student newStudent = new Student("ace", "boyo", "male", 21);
        students.add(newStudent);
    }

    public Student getStudentName(String studentFirstname) throws Exception {
        int initialArraySize = students.size();
        for (Student student: students){
            if(Objects.equals(student.getFirstName(), studentFirstname)){
                return student;

            }
        }
        if(initialArraySize == students.size()){
            throw new Exception("Student not Found");
        }
       return null;
    }

    public Student getStudent(int studentId) {
        for(Student student: students){
            if(student.studentId() == studentId){
                return student;
            }
        }

        return null;
    }

    public ArrayList<Student> getListOfStudents() {
        return students;
    }

    public void deleteCourse(String courseName) throws Exception {
        int initialArraySize = courses.size();
        for(Course course : courses){
            if(Objects.equals(course.getCourseName(), courseName)){
                courses.remove(course);
                break;
            }
        }
        if(initialArraySize == courses.size()){
            throw new Exception("Course Not Found");
        }
    }

    public void deleteStudentUsingStudentId(int studentId){
        int initialArraySize = students.size();
        for(Student student: students){
            if(student.studentId() == studentId){
                students.remove(student);
                break;
            }
        }
        if(initialArraySize == students.size()){
            throw new IllegalArgumentException("Student Not Found");
        }
    }


    public Course getCourse(int courseId){
        for(Course course: courses){
            if(course.getCourseId()== courseId){
                return course;
            }
        }
        throw new IllegalArgumentException("Course Not Found");
    }
}
