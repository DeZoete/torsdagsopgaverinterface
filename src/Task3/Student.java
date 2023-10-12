package Task3;

import Task3.Person;

import java.util.ArrayList;

public class Student extends Person {


    public ArrayList<String> passedCourses = new ArrayList<>();
    public ArrayList<String> currentCourses = new ArrayList<>();


    Student(String name,ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
    }
    @Override
    public  boolean  addCourse(String course) {


        if(passedCourses.contains(course)) {
            return false;

        } else {
           this.currentCourses.add(course);
            return true;

        }
    }

}


