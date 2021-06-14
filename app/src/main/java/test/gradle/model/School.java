
package test.gradle.model;

import java.util.ArrayList;
import test.gradle.model.Student;

public class School{
    private ArrayList<Student> students;

    public School(){
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }

}
