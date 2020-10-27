public class getCrs {
    String CourseName,CourseID,Credits,HOD_ID;

    public getCrs(String cName,String cid,String cdt,String hid)
    {
        this.CourseName=cName;
        this.CourseID=cid;
        this.Credits= cdt;
        this.HOD_ID=hid;
    }
    public String getCourseID() {
        return CourseID;
    }
    public void setCourseID(String courseID) {
        CourseID = courseID;
    }
    public String getCourseName() {
        return CourseName;
    }
    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
    public String getCredits() {
        return Credits;
    }
    public void setCredits(String credits) {
        Credits = credits;
    }
    public String getHOD_ID() {
        return HOD_ID;
    }
    public void setHOD_ID(String hOD_ID) {
        HOD_ID = hOD_ID;
    }
}
