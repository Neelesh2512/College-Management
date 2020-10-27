
public class getDean {

    String Name,Age, PhoneNumber,Department,Email_ID;

    public getDean(String Name,String Age,String Mobilen,String Dep,String EmailID)
    {
        this.Name=Name;
        this.Age= Age;
        this.PhoneNumber=Mobilen;
        this.Department=Dep;
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
    public String getDepartment() {
        return Department;
    }
    public void Department(String department) {
        Department = department;
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
    
}
