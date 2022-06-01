package Chapter3;

public class Human {
    int age;
    String gender;
    String name;
    int height;
    String complexion;

    public Human(int age, String gender, String name, int height, String complexion) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.height = height;
        this.complexion = complexion;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setComplexion(String complexion){
        this.complexion = complexion;
    }

    public int getAge(int age){
        return age;
    }

    public String getGender(String gender){
        return gender;
    }

    public String getName(String name){
        return name;
    }

    public int getHeight(int height){
        return height;
    }
    public String getComplexion(String complexion){
        return complexion;
    }
}
