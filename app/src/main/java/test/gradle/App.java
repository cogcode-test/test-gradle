
package test.gradle;

import test.gradle.model.*;

public class App 
{
    public static void main( String[] args )
    {
        School school = new School();
        school.addStudent(new Student(10));
    }
}
