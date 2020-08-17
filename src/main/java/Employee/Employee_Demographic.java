package Employee;

public class Employee_Demographic {

    private String dob;
    private String gender;
    private String marital_status;
    private String education;

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public String getDob() {
        return dob;
    }

    public String getEducation() {
        return education;
    }

    public String getGender() {
        return gender;
    }

    public String getMarital_status() {
        return marital_status;
    }

}
