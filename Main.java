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
           Account account=new Account("10","ahmed");
        Account account1 = new Account("12","mohmmed",10000);
        account.set_ID("1");
        account.set_Name("badr");
        account1.set_Name("suleiman");
        account1.set_ID("2");
        account1.set_Balance(12000);
        account.credit(2000);
        account.debit(1000);
        account1.transferTo(account,200);


        System.out.println(account1.getBalance());
        System.out.println(account.getID());
        System.out.println(account.getName());
        System.out.println(account1.getName());
        System.out.println(account1.getID());
        System.out.println(account1.getBalance());


    }
}
