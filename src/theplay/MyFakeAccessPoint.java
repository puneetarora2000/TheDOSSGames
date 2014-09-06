/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theplay;

/**
 *
 * @author Ecologic  router 
 */
public class MyFakeAccessPoint  extends AccessPoint{

    public MyFakeAccessPoint(String password, String Name, String ID) {
        super(password, Name, ID);
    }

    
    
    
    
    @Override
    public void setID(String ID) {
        super.setID(ID); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getID() {
        return super.getID(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
