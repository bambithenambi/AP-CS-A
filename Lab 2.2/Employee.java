import java.util.*;
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;
    private String company;
    private static ArrayList<Employee> companyRoster= new ArrayList<>();
    private static int previousID = -1;

    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.company = "Dunder Mifflin";
        companyRoster.add(this);
    }
    public int getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getName() {
        return firstname + " " + lastname;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return salary*12;
    }
    public int raiseSalary(int percent) {
        salary += (int) (salary*percent/100);
        return salary;
    }
    public String toString(){
        String msg = "";
        msg += "Id: "+id+"\n";
        msg += "Name: "+getName()+"\n";
        msg += "Salary: "+salary+"\n";
        return msg;
    }
    /*public String newBoss(Employee boss) {
        this.boss = boss;
        return this.boss.getName();
    }
    */
    public static String closeUpOffice() {
        Random rand = new Random();
        int randomEmployee = rand.nextInt(companyRoster.size());
        while (companyRoster.get(r).id == previousID) {
            r = rand.nextInt(companyRoster.size());
        }
        previousID = companyRoster.get(r).getId();
        return companyRoster.get(r).getName();
    }

    
}
