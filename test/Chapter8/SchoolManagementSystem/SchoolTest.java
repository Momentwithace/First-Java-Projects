package Chapter8.SchoolManagementSystem;

import SchoolManagementSystem.School;
import SchoolManagementSystem.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SchoolTest {
    School school;

    @BeforeEach
    void setUp(){
        school = new School("Semicolon");
    }

    @Test
    void testThatWeHaveASchool(){
        assertNotNull(school);
    }

    @Test
    void testThatWeCreateSchoolName(){
        school.createSchoolName("Semicolon");
        assertEquals("Semicolon", school.getSchoolName());
    }

    @Test
    void testThatSchoolCanAddACourse() throws Exception {
        school.addCourseToSchool("Java");
        assertEquals("Java", school.getCourse("Java").getCourseName());
    }

    @Test
    void testThatWeCanGetListOfCourses(){
        school.addCourseToSchool("Java");
        school.addCourseToSchool("Python");
        school.addCourseToSchool("Database");
        school.getListOfCourse();
        assertEquals(3, school.getListOfCourse().size());
       // assertEquals("Java\nPython\nDatabase\n", school.getListOfCourse());
    }

    @Test
    void testThatWeSchoolCanDeleteACourse() throws Exception {
        school.addCourseToSchool("Java");
        school.deleteCourse("Java");
        assertEquals(0, school.getListOfCourse().size());
    }

    @Test
    void testThaSchoolCanAddStudent(){
        Student newStudent = new Student("Tman", "Boyo", "male", 24);
        school.addStudent(newStudent);
        assertEquals(1, school.getListOfStudents().size());
        //assertEquals(1001, school.getStudent(1001).studentId());
       // assertNotNull( school.getStudent(1001));
    }

    @Test
    void testThatSchoolCanDeleteAStudent() {
        school.addStudent(new Student("ace", "black", "male" ,23));
        school.deleteStudentUsingStudentId(1001);
        assertEquals(0, school.getListOfStudents().size());
    }

    @Test
    void testThatSchoolCanGetListOfStudent(){
        school.addStudent(new Student("ace", "black", "male", 21));
        school.addStudent(new Student("elon", "mary", "male", 23));
        school.getListOfStudents();
        assertEquals(2, school.getListOfStudents().size());
    }

}