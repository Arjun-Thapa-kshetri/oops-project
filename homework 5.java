package twentytwo.fall.oop.l5.a5.M22W0385;

class Student {

    public String number;
    String name;
    String surname;
    String major;
    int passYear;

    //constructor to initialize all variables
    Student(String number, String name, String surname, String major, int year){
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.major = major;
        this.passYear = year;

    }
    //method which is going to increment year by 1
    void passYear(){
        this.passYear=this.passYear + 1;
    }


}
