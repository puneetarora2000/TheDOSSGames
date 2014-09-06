/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theplay;

/**
 *
 * @author Ecologic
 */
public class NetworkInterface {
    
    private String Name;

    public void setName(String Name) {
        this.Name = Name;
    }

    
        public String ipAddress;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public NetworkInterface(String Name, String ipAddress) {
        this.Name = Name;
        this.ipAddress = ipAddress;
    }

       private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public NetworkInterface(String Name, String ipAddress, int index) {
        this.Name = Name;
        this.ipAddress = ipAddress;
        this.index = index;
    }
 
    
    
    
    
}
