public class getDep {

    String DepartmentName,DepartmentID,DeanDepartment;

    public getDep(String depName,String depid,String deandep)
    {
        this.DepartmentName=depName;
        this.DepartmentID=depid;
        this.DeanDepartment= deandep;
    }
    public String getDeanDepartment() {
        return DeanDepartment;
    }
    public void setDeanDepartment(String deanDepartment) {
        DeanDepartment = deanDepartment;
    }
    public String getDepartmentID() {
        return DepartmentID;
    }
    public void setDepartmentID(String departmentID) {
        DepartmentID = departmentID;
    }
    public String getDepartmentName() {
        return DepartmentName;
    }
    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }
}
