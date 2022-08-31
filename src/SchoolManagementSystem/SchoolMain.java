package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SchoolMain {
    static Course course;
    static School school;
    public static void sleep(){
        for(int i = 0; i < 7; i++) {
            System.out.print(".");
            try {

                Thread.sleep(1000);
            } catch (Exception ignored) {

            }

        }
        System.out.println();
    }
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        try{
            school = new School("SEMICOLON AFRICA");
            createCourses();
            //System.out.print("Welcome to Semicolon Africa");
           // sleep();
            System.out.print("""
                           WELCOME TO SEMICOLON AFRICA
                           
                    
                             CODING JUST GOT EASY...
                       
                """);
            System.out.println();

            int sentinal = 1;
            while (sentinal != -1) {

                int userInput = mainMenu();
                switch (userInput) {
                    case 1 -> visitSchoolPortal();
                    case 2 -> visitAdimsDashboard();
                    case 3 -> LoginToStudentPortal();
                    case 4 -> viewCoursePortal();
                    case 5 -> sentinal = -1;
                }
            }

        }catch (IllegalArgumentException | InputMismatchException e){
            System.out.println(e.getMessage());
        }

    }

    private static void createCourses() {
        String[] courses = {"JAVA", "DATABASE", "PYTHON", "JAVASCRIPT", "REACT", "NODE", "C++"};
        for (int i = 0; i < courses.length; i++) {
            school.addCourseToSchool(courses[i]);
        }


    }

    private static int mainMenu() {
        String menu = """
                             SCHOOL DASHBOARD
                        1 -> Visit School Portal
                        2 -> Visit Adim's Dashboard
                        3 -> Login To Student Portal
                        4 -> View Course Portal
                        5 -> Exit
               >>>""";
        System.out.print(menu);
        int userInput = input.nextInt();
        return userInput;
    }



    private static void viewCoursePortal() {
        System.out.println("LIST OF COURSES AVAILABLE");
        ArrayList<Course> schoolCourses = school.getListOfCourse();
        for (Course course: schoolCourses){
            System.out.println(course);
        }
        System.out.println("""
                  1 -> MainMenu
                  2 -> ADIM'S DASHBOARD
                """);
        int userInput = input.nextInt();
        if(userInput == 1){
            mainMenu();
        }else visitAdimsDashboard();
    }

    private static void LoginToStudentPortal() {

    }

    private static void visitAdimsDashboard() {
        System.out.print("""
                          ADIM'S DASHBOARD
                  1 -> Admit New Student Profile
                  2 -> Remove Student
                  3 -> View All Student
                  4 -> View Courses
                  5 -> Back
                >>>""");
        int userInpit = input.nextInt();
        switch (userInpit){
            case 1 -> admitNewStudent();
            case 2 -> removeStudent();
            case 3 -> viewAllStudent();
            case 4 -> viewCourse();
            case 0 -> mainMenu();
        }
    }

    private static void viewAllStudent() {
        ArrayList<Student> allStudent = school.getListOfStudents();
        for (int i = 0; i < allStudent.size() ; i++) {
            String studentName = allStudent.get(i).getFirstName();
            int studentId = allStudent.get(i).studentId();
            System.out.printf("""
                    Student name: %s
                    Student ID: %d
                    
                    """, studentName, studentId);
        }
    }

    private static void viewCourse() {
       System.out.println("LIST OF COURSES AVAILABLE");
        ArrayList<Course> schoolCourses = school.getListOfCourse();
        for (Course course: schoolCourses){
            System.out.println(course);
        }
        System.out.print("""
                 
                  1 -> ADIM'S DASHBOARD
                  
                >>>""");
        int userInput = input.nextInt();
        if(userInput == 1) {
            visitAdimsDashboard();
        }

    }

    private static void removeStudent() {
        System.out.println("Enter ID Of Student To Remove: ");
        int id = input.nextInt();
        school.deleteStudentUsingStudentId(id);
    }

    private static void admitNewStudent() {
        try {
            System.out.println("Enter FirstName: ");
            String studentFirstName = input.next();
            System.out.println("Enter SecondName: ");
            String studentSecondName = input.next();
            System.out.println("Enter Gender: ");
            String gender = input.next();
            System.out.println("Enter Age: ");
            int age = input.nextInt();
            Student student = new Student(studentFirstName, studentSecondName, gender, age);
            school.addStudent(student);
            System.out.println();
            System.out.print("Confirming Details");
            sleep();
            System.out.println("Details Confirmed");
            System.out.print("Creating Profile");
            sleep();
            System.out.println();
            System.out.println("Welcome to Semicolon Africa " + studentFirstName);
            System.out.println();

            do {
                System.out.println("LIST OF COURSES AVAILABLE");
                ArrayList<Course> schoolCourses = school.getListOfCourse();
                for (Course course : schoolCourses) {
                    System.out.println(course);
                    System.out.println();
                }
                System.out.println("Enter Course Id To Register: ");
                int courseId = input.nextInt();
                Course course = school.getCourse(courseId);
                student.addCourse(course);
                System.out.println("Press 1 to Add Another Course or 0 to End: ");
            } while (input.nextInt() != 0);
            System.out.println();

        } catch (InputMismatchException | IllegalArgumentException e ) {
            System.out.println(e.getMessage());
        }
    }

    private static void visitSchoolPortal() {
        System.out.print("""
                            ABOUT US...
               Semicolon Africa is a tech base institute,
               founded 2019 in the South-Western part of Nigeria(Lagos)
               by Sam Immanuel, a member of the Harambeans as well as,
               the Henley Business School, and many other prominent 
               organisation.
               
               He foresee the need of Tech in the growth of the economy,
               as well as it's impact in building great leaders through,
               knowledge and skill impaction, considering the vast majority,
               of unemployment, in the western africa.
               
               Semicolon Africa in the space of 2 year's since its, been
               established as added good number or credits to her name, 
               as well as producing great number of tech gee,
               among the good records is the fund raising of $1.2million,
               in an oversubscribe seed funding round led by Launch Africa
               Ventures and consonance Investment Managers.
               
               
               
               0 -> Back
               >>>>""");
        int userInput = input.nextInt();
        if(userInput == 0){
            mainMenu();
        }
    }


}
