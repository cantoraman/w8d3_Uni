package models;

import javax.persistence.*;


@Entity
@Table(name="students")
public class Student {

    private int id;
    private String name;
    private int age;
    private int enrollment;
    private Mentor mentor;
    private Course course;

    public Student() {
    }

    public Student(String name, int age, int enrollment, Mentor mentor, Course course) {

        this.name = name;
        this.age = age;
        this.enrollment = enrollment;
        this.mentor = mentor;
        this.course = course;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "enrollment")
    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    @OneToOne
    @JoinColumn(name = "mentor_id", nullable = false)
    //this creates the mentor_id here...
    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
