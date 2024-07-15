public class Employee {
    private String id;
    private String name;
    private int salary;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void setID(String id) {
        this.id = id;
    }

    public String getID() {
        return this.id;
    }
    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void setSalary (int salary) {
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raisedSalary(int percent) {
        int raiseAmount = (salary * percent) / 100;
        salary += raiseAmount;
        return salary;
    }


    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary+"]";
}
}
