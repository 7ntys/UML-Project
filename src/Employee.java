public class Employee extends Person{
    private double salary;
    private String jobTitle;

    public Employee(String firstName, String lastName, int age, int id, double salary, String jobTitle) {
        super(firstName, lastName, age, id);
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" +
                "salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
