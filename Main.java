public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("1","ahmed",10000);
        System.out.println("The ID is " +employee.getID());
        System.out.println("The employee name is" + employee.getName());
        System.out.println("The salary is "+employee.getSalary());
        employee.setName("mohmmed");
        employee.setID("2");
        System.out.println("The new ID is " +employee.getID());
        System.out.println("The new employee name is" + employee.getName());
        employee.setSalary(8000);
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        employee.raisedSalary(9);
        System.out.println("Updated Salary: " + employee.getSalary());

    }
}