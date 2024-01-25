package models;

public abstract class Person implements Payable{
    //fields
    private int id;
    private String name;
    private String surname;
    //Helper static variable for id
    private static int id_gen = 1;
    //Constructors
    public Person(){
        id = id_gen++;
    }
    //Parametrized constructor
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }
    //Output of parameters (e.g. “1. John Lennon”)
    @Override
    public String toString() {
        return id + ". " + name + ' ' + surname;
    }
    //getters and setters for fields (id have only getter)
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    //Student is default position, Employee need to determine
    public String getPosition(){
        return "Student";
    }
}
