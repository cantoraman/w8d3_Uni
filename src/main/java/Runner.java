import db.DBHelper;
import models.Course;
import models.Lesson;
import models.Mentor;
import models.Student;
import sun.security.pkcs11.Secmod;


import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Course course = new Course("Maths", "Basic");
        DBHelper.save(course);

        Lesson lesson1 = new Lesson("Trigonometry", "e22", course);
        DBHelper.save(lesson1);
        Lesson lesson2 = new Lesson("Statistics", "e23", course);
        DBHelper.save(lesson2);

        Mentor mentor = new Mentor("Wil");
        DBHelper.save(mentor);

        Student student1 = new Student("Can", 33, 1223, mentor, course);
        DBHelper.save(student1);

    }
}
