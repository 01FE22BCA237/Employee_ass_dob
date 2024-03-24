


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person extends Employee_details  {
    public String name;
    public String dob;

    public void displayName() {
        System.out.println("Employee Name: " + name);
    }

    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age +"years");


    }
    public static void main(String[] args) {
        Person s=new Person();
       Employee_details s1= new Employee_details();
        s.name = "Sadhana Umarani";
        s.displayName();
        s.displayAge("21-09-2004");
        s1.display(103, 50000.00);
        s1.displayEmployeeDetails();

        

   }
}

