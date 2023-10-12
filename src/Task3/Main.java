package Task3;
import Task3.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

         ArrayList<String> passedCourses1 = new ArrayList<>();
        ArrayList<String> passedCourses2 = new ArrayList<>();
        ArrayList<String> canTeach1 = new ArrayList<>();
        ArrayList<String> canTeach2 = new ArrayList<>();
        ArrayList<Person> persons = new ArrayList<>();
        passedCourses2.add("Java 1.0");
        canTeach1.add("Java 1.0");
Student s1 = new Student("Jonas",passedCourses1);
Student s2 = new Student("Frederik", passedCourses2);
Teacher t1 =new Teacher("Kasper",canTeach1);
        Teacher t2 =new Teacher("Frank",canTeach2);

persons.add(s1);
persons.add(s2);
persons.add(t1);
persons.add(t2);
for(Person p: persons) {
    if(!p.addCourse("Java 1.0")) {
        System.out.println(p.getName());
        if( p instanceof Student){
            System.out.println(" har allerede bestået dette kursus.");
        }
        else if(p instanceof Teacher){
            System.out.println("kan ikke undervise i dette fag");
        }


    }




}
}


    }

