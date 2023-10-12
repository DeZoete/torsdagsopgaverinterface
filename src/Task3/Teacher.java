package Task3;

import Task3.Person;

import java.util.ArrayList;

public class Teacher extends Person {

    public ArrayList<String> currentCourses = new ArrayList<>();
    public ArrayList<String> canTeach = new ArrayList<>();
    public Teacher(String name,ArrayList<String> canTeach) {

        super(name);
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course) {
        if(canTeach.contains(course)) {
            this.currentCourses.add(course);

            return true;

        }
        else{

            return false;
        }
    }
}
