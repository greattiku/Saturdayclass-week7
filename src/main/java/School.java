
import java.util.List;

public class School {
    String Firstname;
    String Lastname;
    int Age;
    String Coursesenrolled;

    String StudentID;
    double Salary;
    String Department;
    String Designation;
    String EmployeeID;



    public String getFirstname() {
        return Firstname;
    }

   public void setFirstname(String firstname) {
        this.Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        this.Lastname = lastname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }



    public String getCoursesenrolled() {
        return Coursesenrolled;
    }

    public void setCoursesenrolled(String coursesenrolled) {
        Coursesenrolled = coursesenrolled;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        this.StudentID = studentID;
    }
    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }


}
