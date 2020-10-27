
public class getTable {

        String Name,Age, PhoneNumber,Designation,Email_ID;

        public getTable(String Name,String Age,String Mobilen,String Des,String EmailID)
        {
            this.Name=Name;
            this.Age= Age;
            this.PhoneNumber=Mobilen;
            this.Designation=Des;
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
        public String getDesignation() {
            return Designation;
        }
        public void setDesignation(String designation) {
            Designation = designation;
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
