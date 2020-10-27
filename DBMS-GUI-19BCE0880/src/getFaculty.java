
public class getFaculty {

    String Name,FacultiID,Age,PhoneNumber,Designation,Email_ID,Salary,Department_ID;

    public getFaculty(String Name,String fid,String Age,String Mobilen,String desgid,String EmailID,String sal,String depID)
    {
        this.Name=Name;
        this.FacultiID=fid;
        this.Age= Age;
        this.PhoneNumber=Mobilen;
        this.Designation=desgid;
        this.Email_ID=EmailID;
        this.Salary=sal;
        this.Department_ID=depID;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getAge() {
        return Age;
    }
    public void setAge(String age) {
        Age = age;
    }
    public String getFacultiID() {
        return FacultiID;
    }
    public void setFacultiID(String facultiID) {
        FacultiID = facultiID;
    }
    public String getEmail_ID() {
        return Email_ID;
    }
    public void setEmail_ID(String email_ID) {
        Email_ID = email_ID;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public String getDesignation() {
        return Designation;
    }
    public void setDesignation(String designation) {
        Designation = designation;
    }
    public String getDepartment_ID() {
        return Department_ID;
    }
    public void setDepartment_ID(String department_ID) {
        Department_ID = department_ID;
    }
    public String getSalary() {
        return Salary;
    }
    public void setSalary(String salary) {
        Salary = salary;
    }
}
