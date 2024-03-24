public 
class Employee_details {
    private int empId;
    private double salary;

    public void display( int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

}
    

