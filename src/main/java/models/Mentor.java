package models;

        import org.hibernate.metamodel.binding.FetchProfile;

        import javax.persistence.*;

public class Mentor {

    private int id;
    private String name;
    private Student student;

    public Mentor() {
    }

    public Mentor(String name, Student student) {

        this.name = name;
        this.student = student;
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

    @OneToOne(mappedBy="mentor", fetch = FetchType.LAZY)
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
}

