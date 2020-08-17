package Employee;


public class Employee {

    private int employee_id;
    private String employee_fname;
    private String employee_lname;
    private Employee_Demographic employee_demographic = new Employee_Demographic();
    private Role role = new Role();

    public void setEmployee_fname(String employee_fname) {
        this.employee_fname = employee_fname;
    }

    public void setEmployee_lname(String employee_lname) {
        this.employee_lname = employee_lname;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public Role getRole() {
        return this.role;
    }

    public Employee_Demographic getEmployee_demographic() {
        return this.employee_demographic;
    }

    public String getEmployee_lname() {
        return employee_lname;
    }

    public String getEmployee_fname() {
        return employee_fname;
    }

    public int getEmployee_id() {
        return employee_id;
    }

}
