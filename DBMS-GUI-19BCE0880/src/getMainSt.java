
public class getMainSt {

    String Name,Employee_ID,Age,Workplace,PhoneNumber,Designation,Salary;

    public getMainSt(String Name,String Eid,String Age,String workp,String Mobilen,String desgid,String sal)
    {
        this.Name=Name;
        this.Employee_ID=Eid;
        this.Age= Age;
        this.Workplace=workp;
        this.PhoneNumber=Mobilen;
        this.Designation=desgid;
        this.Salary=sal;
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
    public String getSalary() {
        return Salary;
    }
    public void setSalary(String salary) {
        Salary = salary;
    }
    public String getEmployee_ID() {
        return Employee_ID;
    }
    public void setEmployee_ID(String employee_ID) {
        Employee_ID = employee_ID;
    }
    public String getWorkplace() {
        return Workplace;
    }
    public void setWorkplace(String workplace) {
        Workplace = workplace;
    }
}
