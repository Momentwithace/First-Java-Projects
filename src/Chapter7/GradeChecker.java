package Chapter7;

public class GradeChecker {
    String[] studentName = new String[100];


    public void setName(String name) {
        for (int i = 0; i < studentName.length; i++) {
            if(studentName[i]==null){
                studentName[i] = name;
                break;
            }

        }
    }

    public void setSubject(String subject) {
        for (int i = 0; i < studentName.length; i++) {
            if(studentName[i] == null) {
                studentName[i] = subject;
                break;
            }
        }
    }
}
