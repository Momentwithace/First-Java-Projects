package Chapter8.SchoolManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    Student student;

    @BeforeEach
    void setUp(){
        student = new Student("Tman", "Boyo", "Male", 23);
    }

    @Test
    void testThatWeHaveAStudent(){
        assertNotNull(student);
    }

    @Test
    void testThatWeCanSetStudentFirstName(){
      student.setFirstName("Tman");
      assertEquals("Tman", student.getFirstName());
    }

    @Test
    void testThatWeCanSetStudentSecondName(){
        student.setSecondName("Boyo");
        assertEquals("Boyo", student.getSecondName());
    }

    @Test
    void testThatWeCanSetStudentGender(){
        student.setGender("Male");
        assertEquals("Male",  student.getGender());
    }

    @Test
    void testThatWeCanSetStudentAge(){
        student.setAge(23);
        assertEquals(23, student.getAge());
    }

    @Test
    void testThatStudentCanAddACourse() throws Exception {
        student.addCourse("Java");
        assertEquals("Java", student.getCourse("Java").getCourseName());
    }

    @Test
    void testThatStudentCanDropACourse() throws Exception {
        student.addCourse("Java");
        student.dropCourse("Java");
        assertEquals(0 ,student.getCourseList().size());
    }
}
