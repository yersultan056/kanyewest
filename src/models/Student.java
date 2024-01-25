package models;

public class Student extends Person{
    //GPA
    private double gpa;
    //Output of parameters (e.g. “Student: 1. John Lennon”)
    @Override
    public String toString() {
        return getPosition() + ": " + getId() + ". " + getName() + ' ' + getSurname();
    }
    //2 constructors
    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa){
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }
    //get and set gpa
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public double getPaymentAmount(){
        if (gpa > 2.67) return 36660.00;
        return 0;
    }
    public int compareTo(Person person){
        if(getPaymentAmount() == person.getPaymentAmount()) return 0;
        else if (getPaymentAmount() < person.getPaymentAmount()) return -1;
        return 1;
    }
}
