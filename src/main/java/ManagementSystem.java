import java.util.InputMismatchException;

import java.util.Scanner;




public class ManagementSystem extends School implements UniversityDetails{
    Scanner sc = new Scanner(System.in);

    public void details(){


    try {
            System.out.println("Student enter 1 \nEmployee 2 \n>>");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    studentDetails();
                    break;
                case 2:
                    employeeDetails();
                    break;
                default:
                    throw new InputMismatchException("Unexpected value: input should be between 1 and 2");
            }
    } catch (InputMismatchException e) {
        System.out.println("Something went wrong: Input Mismatch \nReload and try again.");
    }

    }

    public void studentDetails() {
        System.out.println("enter firstname:");
        setFirstname(sc.next());

        System.out.println("enter lastname:");
        setFirstname(sc.next());

        System.out.println("enter age:");
       setAge(sc.nextInt());

       System.out.println("enter Coursesenrolled:");
      setCoursesenrolled(sc.next());



        System.out.println("enter StudentID:");
        setStudentID(sc.next());


        System.out.println("Firstname: " + getFirstname() +
                           "\nLastName: " + getLastname() +
                           "\nAge: " + getAge() +
                       //    "\nCoursesenrolled: " + getCoursesenrolled() +
                           "\nStudentID: " + getStudentID());


        }


    public void employeeDetails() {
        System.out.println("enter firstname:");
        setFirstname(sc.next());

        System.out.println("enter lastname:");
        setFirstname(sc.next());

        System.out.println("enter age:");
        setAge(sc.nextInt());

        System.out.println("enter salary:");
        setSalary(sc.nextDouble());

        System.out.println("enter department:");
        setDepartment(sc.next());

        System.out.println("enter designation:");
        setDesignation(sc.next());

        System.out.println("enter employeeID:");
        setEmployeeID(sc.next());


        System.out.println("Firstname: " + getFirstname() +
                        "\nLastName: " + getLastname() +
                        "\nAge: " + getAge() +
                        "\nSalary: " + getSalary() +
                        "\nDepartment: " + getDepartment() +
                        "\nDesignation: " + getDesignation());

    }



}