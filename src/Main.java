import models.Person;
import models.Employee;
import models.Student;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        //Several employees and students (Messi is not taking stipend because of GPA)
        Employee Employee1 = new Employee("Kendrick", "Lamar", "Rapper", 5000);
        Employee Employee2 = new Employee("Michael", "Jordan", "Spider-man", 540000);
        Employee Employee3 = new Employee("Dwayne", "Johnson", "Plumber", 100000.27);
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

        printData();
    }
}
