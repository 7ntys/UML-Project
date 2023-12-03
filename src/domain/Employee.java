package domain;

public class Employee extends Person{
    private double salary;
    private String jobTitle;

    private Employee(Builder builder) {
        super();
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.id = builder.id;
        this.salary = builder.salary;
        this.jobTitle = builder.jobTitle;
    }

    @Override
    public String toString() {
        return super.toString() + "domain.Employee{" +
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

    public static class Builder{
        private double salary;
        private String jobTitle;
        private String firstName;
        private String lastName;
        private int age;
        private String id;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }
        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Employee build(){
            Employee employee = new Employee(Builder.this);
            employee.setSalary(salary);
            employee.setJobTitle(jobTitle);
            return employee;
        }
    }
}
