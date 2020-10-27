public class getAcad {
    String BuildingName,BuildingID,Departmentallotted,No_of_floors;
    getAcad(String buildingName,String buildingID,String departmentalloted,String no_of_floors)
    {
        this.BuildingID=buildingID;
        this.BuildingName=buildingName;
        this.Departmentallotted=departmentalloted;
        this.No_of_floors=no_of_floors;
    }
    public String getBuildingID() {
        return BuildingID;
    }
    public void setBuildingID(String buildingID) {
        BuildingID = buildingID;
    }
    public String getBuildingName() {
        return BuildingName;
    }
    public void setBuildingName(String buildingName) {
        BuildingName = buildingName;
    }
    public String getDepartmentallotted() {
        return Departmentallotted;
    }
    public void setDepartmentallotted(String departmentalloted) {
        Departmentallotted = departmentalloted;
    }
    public String getNo_of_floors() {
        return No_of_floors;
    }
    public void setNo_of_floors(String no_of_floors) {
        No_of_floors = no_of_floors;
    }
}
