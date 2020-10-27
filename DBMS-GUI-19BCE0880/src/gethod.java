
public class gethod {

    String Name,HOD_ID,Age,Course_ID,PhoneNumber,Salary,Email_ID;

    public gethod(String Name,String hodid,String Age,String crsid,String Mobilen,String sal,String EmailID)
    {
        this.Name=Name;
        this.HOD_ID=hodid;
        this.Age= Age;
        this.Course_ID=crsid;
        this.PhoneNumber=Mobilen;
        this.Salary=sal;
        this.Email_ID=EmailID;
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
    public String getHOD_ID() {
        return HOD_ID;
    }
    public void setHOD_ID(String hOD_ID) {
        HOD_ID = hOD_ID;
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
    public String getCourse_ID() {
        return Course_ID;
    }
    public void setCourse_ID(String course_ID) {
        Course_ID = course_ID;
    }
    public String getSalary() {
        return Salary;
    }
    public void setSalary(String salary) {
        Salary = salary;
    }
}
