public class EmployeeTester {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John", "Doe", 10);
        Employee e2 = new Employee(2, "Jock", "Doe", 100);
        Employee e3 = new Employee(2, "JANE", "Doer", 1000);
        System.out.println(e1.getId());
        System.out.println(e1.getFirstname());
        System.out.println(e1.getLastname());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        System.out.println(e1.getAnnualSalary());
        e1.setSalary(100);
        e1.raiseSalary(25);
        System.out.println(Employee.closeUpOffice());
        System.out.println(Employee.closeUpOffice());
        System.out.println(Employee.closeUpOffice());
        System.out.println(Employee.closeUpOffice());
        System.out.println(Employee.closeUpOffice());
        System.out.println(Employee.closeUpOffice());
    }
}   
