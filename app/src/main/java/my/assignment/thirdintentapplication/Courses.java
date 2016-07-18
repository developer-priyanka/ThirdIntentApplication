package my.assignment.thirdintentapplication;

/**
 * Created by root on 7/18/16.
 */

public class Courses {
    String name;
    String mentor;

    public Courses(String name,String instructor){
        this.name=name;
        mentor=instructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }
}
