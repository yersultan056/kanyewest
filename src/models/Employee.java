package models;

public class Employee extends Person {
    //Fields
    private double salary;
    private String position;
    //Output of parameters (e.g. “Employee: 1. John Lennon”)
    @Override
    public String toString() {
        return position + ": " + getId() + ". " + getName() + ' ' + getSurname();
    }
    //2 constructors
    public Employee(){
        super();
    }
    public Employee(String name, String surname, String position, double salary){
        this();
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }
    //Getters and setters for position and salary
    public void setPosition(String position) {
        this.position= position;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public String getPosition(){
        return position;
    }
    @Override
    public double getPaymentAmount(){
        return salary;
    }
}
