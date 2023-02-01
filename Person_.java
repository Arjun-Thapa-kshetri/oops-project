package twentytwo.fall.oop.l7.a7b.m22w0385;

public class Person implements Employee {
    //creating private string name variables.
    private String name;
    //creating private string surname variables.
    private String surname;
    //creating private Day workingDay variable.
    private Day workingDay;

    //constructor to initialize attributes
    public Person(String name, String surname, Day workingDay){
        this.name = name;
        this.surname = surname;
        this.workingDay = workingDay;
    }

    //setter for working day
    public void setWorkingDay(Day workingDay) {
        this.workingDay = workingDay;
    }
    @Override
    public void isWorking() {
        System.out.println(name + " " + surname + " " + "is working on" + " " + workingDay);
    }

    @Override
    public void isOnHoliday() {
        System.out.println(name + " " + surname + " " +  "is on holiday on" + " " + workingDay);
    }

    @Override
    public void isSick() {
        System.out.println(name + " " + surname + " " + "is sick on" + " " + workingDay);
    }

}
