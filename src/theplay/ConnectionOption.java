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
public class ConnectionOption {

    public ConnectionOption() {
    }
    
    
    //ssid
    
        public String ssid;

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    
    
    public ConnectionOption(String ssid) {
        
        this.ssid =ssid;
        
    }
    
    
    
}
