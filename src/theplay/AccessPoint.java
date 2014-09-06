 

package theplay;

 
public class AccessPoint {

    public AccessPoint(String Name, String ID) {
        this.Name = Name;
        this.ID = ID;
    }

    public AccessPoint(String password, String Name, String ID) {
        this.password = password;
        this.Name = Name;
        this.ID = ID;
    }
    
    
    
    
    
     public String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String Name;

    public String getName() {
        return Name;
    }

    public String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    
    
    
}
