import models.Person;
import models.Employee;
import models.Student;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        //Several employees and students (Messi is not taking stipend because of GPA)
        Employee Employee1 = new Employee("Kendrick", "Lamar", "Employee", 5000);
        Employee Employee2 = new Employee("Michael", "Jordan", "Employee", 540000);
        Employee Employee3 = new Employee("Dwayne", "Johnson", "Employee", 100000.27);
        Student Student1 = new Student("Messi", "Lionel", 2.66);
        Student Student2 = new Student("Ishow", "Speed", 3.98);

        //Create list for all employees and students
        ArrayList<Person> dudes = new ArrayList<>();

        //fill list with all employees and students
        dudes.add(Employee1);
        dudes.add(Employee2);
        dudes.add(Employee3);
        dudes.add(Student1);
        dudes.add(Student2);
        Collections.sort(dudes);
        //A call to printData method
        printData(dudes);
    }
    public static void printData(Iterable<Person> dudes){
        //foreach loop
        for(Person dude : dudes){
            System.out.println(dude.toString() + " earns " + dude.getPaymentAmount() + " tenge");
        }
    }
}
