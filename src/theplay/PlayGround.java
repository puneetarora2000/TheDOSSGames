/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theplay;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  Distributed Hash Tables 
 * @author Ecologic
 */
public class PlayGround {
    
    
    public static Hashtable BuildFakeAccessPointBroadCast(){
    
      Hashtable ar =new Hashtable();        
       Random r = new Random();
        int no = r.nextInt(10);
        
        for(int i = 1;i<no;i++){
          MyFakeAccessPoint ap =   new MyFakeAccessPoint("","","") ; // by deafult
            TheAttacker ak = new TheAttacker();
            ak.setSSID("SSID");
            ap.setID(i+"");
          
          if (i<5){
              ap.Name = i+"_"+"G";
         
              System.out.println(ap.getName());
              
          ar.put(ap , ak);
          
          }else{
          //rogue WiFi access point
               ap.Name = i+"_"+"F";
               
            TheAttacker akFake = new TheAttacker();
            ak.setSSID("SSID");
           
                ar.put(ap , akFake);
           
                System.out.println(ap.getName());
          }
          
          
            
        }
    
        return ar ;
    }
    
    
    public boolean ConnectAccessPoint(){
    
        boolean flag = false ;
        
        
        
        return flag;
    
    
    }
    
    
    
  public  static AccessPoint connectByName(String ssid, String password, String interfaceName) throws IOException, Exception {
      
      // Password of Access Point 
      // Interface 
      //ssid
      
      String Tpassword = "abc";
      String Tssid = "abc";
       String Tinterface = "n0";
            
      if ((password.equals(password)) & (interfaceName.equals(interfaceName))& (ssid.equals(ssid)) ) {
          
          
            AccessPoint ap = new AccessPoint("WIFI", ssid, password);
            NetworkInterface ni = new NetworkInterface("N0", "127.0.0.1",1);  
         
            MyFakeClient mfc = new MyFakeClient();
            mfc.setID(1+"");
            mfc.setName(ssid);
            
                HttpURLConnectionMan http = new HttpURLConnectionMan();
 
		System.out.println("Send Http GET request");
		http.sendGet();
                
		System.out.println("Send Http POST request");
		http.sendPost();
          
                System.out.println("Attack Success :");
                
        return ap; 
        
      }else{
                
          System.out.println("Attack Failed :");
          
    // No NetworkInterface available
        return null;
      }
 }
    
    
    
    
    
    
    /*
    public AccessPoint[] getLastUsedAPN() throws IAPInfoException
{        
     //Obtain IAPInfo object by factory
     IAPInfo iapinfo = IAPInfo.getIAPInfo();
     //Get the list of preferred APN.
     AccessPoint ap[];
     try{
     ap[]= iap.getConnectionPreferences();
     return ap[];
     }catch(Exception e) {return null}
}
    */
    
    
     public static boolean mainRun(){
    
        // Open up Client !~ 
        // Create a Fake Access Point !
         
          Random rnd = new Random();
         
          boolean flag = false;
          
         Hashtable t = BuildFakeAccessPointBroadCast();
         
         
         Set<MyFakeAccessPoint> keys = t.keySet();
       //  Set<TheAttacker> akeys = t.entrySet();
       int  counter = 1;
         for(MyFakeAccessPoint key: keys){
         
             System.out.println("Value of "+key.getName()+" is: "+t.get(key));
             String password = "";
             try {
                 connectByName(key.getName(),password, counter + "");
             } catch (Exception ex) {
                 Logger.getLogger(PlayGround.class.getName()).log(Level.SEVERE, null, ex);
             }
              
                     counter =  counter+1;
                      flag = rnd.nextBoolean();
         
         }
         
          
         
         System.out.println("Construction of Playground and With Success Flag Done");
         System.out.println("Construction of Multiple Clients  and With TCP Connections Done");
         System.out.println("Construction of Distributed Attack Platform Ready with Probability");
         
        
        return flag;
        
        
    
    }
}
