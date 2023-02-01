package twentytwo.fall.oop.l7.a7a.m22w0385;

public class Student extends Person {
    private String firstName;
    private String lastName;
    private final String studentid;
    private int graduationYear;

    public Student(String firstName, String lastName, String studentid, int graduationYear) {
        this.firstName = firstName ;
        this.lastName = lastName;
        this.studentid = studentid;
        this.graduationYear= graduationYear;

    }

    @Override
   public String profession() {
        return "Student";
    }
}
