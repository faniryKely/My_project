package exerciceprog.java.exercice;

public class Employee {
    private int id ;
    private String lastName ;
    private String firstName ;
    private double salary ;

    public Employee(int id, String lastName, String firstName, double salary) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public  double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double raise(int percent) {
      double percSalary = getSalary();
        return percSalary += ( percSalary *  percent ) / 100 ;
    }
}
