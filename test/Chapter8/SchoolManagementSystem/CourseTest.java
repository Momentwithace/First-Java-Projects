package Chapter8.SchoolManagementSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {
    @Test
    void testThatWeCanSetACourse(){
        Course newCourse = new Course("Java");
        newCourse.setCourse("Java");
        assertEquals("Java", newCourse.getCourseName());
    }







}
