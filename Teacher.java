package twentytwo.fall.oop.l7.a7a.m22w0385;

public class Teacher extends Person {
    private String firstName;
    private String lastName;
    private final String employeeid;

    public Teacher(String firstName, String lastName, String employeeid) {
        this.firstName= firstName;
        this.lastName= lastName;
        this.employeeid= employeeid;
    }
    @Override
    public String profession() {
        return this.firstName + " " + this.lastName + " is main job is to be a: Teacher";
    }
    public String profession(String partTime) {
        return this.firstName + " " + this.lastName + " is doing a part-time job as a " + partTime;
    }

    public String profession(String job, int workingLoad) {
        if (workingLoad <= 7 * 24) {
            return this.firstName + " " + this.lastName + " is partly working as: " + job + "." + " His working load is: " + workingLoad + " hour(s) a week.";
        } else {
            return "The working load given for " + firstName + " " + lastName + " was more then possible.";
        }
    }
}

