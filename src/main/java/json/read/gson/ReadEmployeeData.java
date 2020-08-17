package json.read.gson;

import Employee.Employee;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadEmployeeData {

    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get("Employee.json"));

        Employee[] employees = gson.fromJson(reader,Employee[].class);

        for (Employee emp : employees) {
            System.out.println("Employee Id : " + emp.getEmployee_id());
            System.out.println("Employee First name : " + emp.getEmployee_fname());
            System.out.println("Employee Last name : " + emp.getEmployee_lname());
            System.out.println("Employee DOB : " + emp.getEmployee_demographic().getDob());
            System.out.println("Employee Gender : " + emp.getEmployee_demographic().getGender());
            System.out.println("Employee Marital Status : " + emp.getEmployee_demographic().getMarital_status());
            System.out.println("Employee Education : " + emp.getEmployee_demographic().getEducation());
            System.out.println("Employee Job Title : " + emp.getRole().getJob_title());
            System.out.println("Employee Job Role : " + emp.getRole().getJob_role());
        }


    }

}
