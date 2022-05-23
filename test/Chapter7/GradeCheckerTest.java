package Chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeCheckerTest {
    GradeChecker aceSchool;

    @BeforeEach
    void setUp() {
        aceSchool = new GradeChecker();
    }
    @Test
    void testThatWeCanHave100Student(){
        int length = aceSchool.studentName.length;
        assertEquals(100, length);
    }
    @Test
    void testEachStudentCanSaveTheirGrade(){
        String name = "ace";
        String name2 = "odugwo";
        aceSchool.setName(name2);
        aceSchool.setName(name);

        for (int i = 0; i < aceSchool.studentName.length; i++) {
            System.out.println(aceSchool.studentName[i]+" ");
        }
        System.out.println();
        assertNotNull(aceSchool.studentName[0]);b
        assertNotNull(aceSchool.studentName[1]);
    }
    @Test
    void testThatEachStudentCanTakeOneThanOneSubject(){
        String Subject = "SUB1";
        String Subject2 = "SUB2";
        String Subject3 = "SUB3";
        aceSchool.setSubject(Subject);
        aceSchool.setSubject(Subject2);
        aceSchool.setSubject(Subject3);
        for (int i = 0; i < aceSchool.studentName.length; i++) {
            System.out.println(aceSchool.studentName[i]+" ");

        }


    }
}