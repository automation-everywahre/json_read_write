package json.write.gson;

import Employee.Employee;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateEmployeeDetails {

    public static void main(String[] args) throws IOException, FilloException {

        Gson gson = new Gson();
        FileWriter fileWriter = new FileWriter("Employee.json");
        List<Employee> lst_emp = new ArrayList<Employee>();
        Employee emp;


        /**
         * Get Data from Excel
         */
        Fillo fillo=new Fillo();
        System.out.println(System.getProperty("user.dir"));
        Connection connection=fillo.getConnection("EmployeeDetails.xlsx");
        String strQuery="Select * from Sheet1";
        Recordset recordset=connection.executeQuery(strQuery);

        while(recordset.next()){
            emp = new Employee();
            emp.setEmployee_id(Integer.parseInt(recordset.getField("employee_id")));
            emp.setEmployee_fname(recordset.getField("employee_fname"));
            emp.setEmployee_lname(recordset.getField("employee_lname"));
            emp.getEmployee_demographic().setDob(recordset.getField("dob"));
            emp.getEmployee_demographic().setGender(recordset.getField("gender"));
            emp.getEmployee_demographic().setMarital_status(recordset.getField("marital_status"));
            emp.getEmployee_demographic().setEducation(recordset.getField("education"));
            emp.getRole().setJob_title(recordset.getField("job_title"));
            emp.getRole().setJob_role(recordset.getField("job_role"));
            lst_emp.add(emp);
            emp = null;
        }

        recordset.close();
        connection.close();

        gson.toJson(lst_emp, fileWriter);
        fileWriter.close();


    }

}
