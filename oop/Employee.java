
package oop;

public class Employee {
    public int emp_id;
    public String name;
    protected String department;
    double age;
    private double salary;

    public void showEmployee() {
        System.out.println("Name : " + name);
    }

    public void raiseSalary(double amount) {
        salary = salary + amount;
    }

    public static void main(String[] args) {
        Employee emp= new Employee();
        emp.emp_id=101;
        emp.name="Sabin";
        emp.department="Admininstration";
        
    }
}




// static -> static
// (require class reference if outside of that class)
// direct access

// static -> non-static
//  need object reference

// non-static -> static
// ( require class reference when accessing from outside of the class)
// direct access

// non-static -> non-static
// (only within class but for other class non-static members we need object of that particular class)
// direct access