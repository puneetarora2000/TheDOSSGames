/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theplay;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Ecologic
 */
public class TheAttacker {
    
     int TargetID = 0 ;

     
     
    public String SSID;

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

     
     
     
    
         public String SoftAccessPoint;

    public String getSoftAccessPoint() {
        return SoftAccessPoint;
    }

    public void setSoftAccessPoint(String SoftAccessPoint) {
        this.SoftAccessPoint = SoftAccessPoint;
    }

     
     
         public String SoftAccessPointName;

    public String getSoftAccessPointName() {
        return SoftAccessPointName;
    }

    public void setSoftAccessPointName(String SoftAccessPointName) {
        this.SoftAccessPointName = SoftAccessPointName;
    }

     
         public String TapinterfaceID;

    public String getTapinterfaceID() {
        return TapinterfaceID;
    }

    public void setTapinterfaceID(String TapinterfaceID) {
        this.TapinterfaceID = TapinterfaceID;
    }

     
    
        public String BridgeName;

    public String getBridgeName() {
        return BridgeName;
    }

    public void setBridgeName(String BridgeName) {
        this.BridgeName = BridgeName;
    }

    
    
    public ArrayList CreateSoftAccessPoint(String eth0){
    
        ArrayList  ar = new   ArrayList(); 
       ar.add("etho");
       ar.add("eth1");
       
       return ar;
    
    }
    
    
    public ArrayList CreateBridge(String eth0 , String enth1){
    
        ArrayList  ar = new   ArrayList(); 
       ar.add("etho");
       ar.add("eth1");
       
       return ar;
    
    }
    
    
     
     public int getTargetID() {
        return TargetID;
    }

    public void setTargetID(int TargetID) {
        this.TargetID = TargetID;
    }
    
    
    
    public void ProbeLaunch(){
    
    Random rnd = new Random();
        
    //Gereratee HELLO , FLOOD , and GET ACK 
    
    for (int i=1;i<100;i++)
    {
     System.out.println("HELLO");
     
     
    
    }
    
    for (int i=1;i<100;i++)
    {
     
        System.out.println("ACK");
     
        
    }
    
    
    
    }
    
    public void Attack() throws Exception{
    
       // AttackConstants.ConnectionPerSecond;
        
        Random rnd = new Random();
        
        for (int i=0;i<AttackConstants.NumberOfConnextions;i++){
            HttpURLConnectionMan doss = new HttpURLConnectionMan();
             System.out.println("Connecttion NO:"+i);
            
    
            //Probe Connextion 
                         System.out.println("Probe Launched");
            ProbeLaunch();
                          
             StopWatch wt = new  StopWatch();
             wt.start();
            Thread.sleep(rnd.nextInt(100));
            wt.stop();
            if (wt.getElapsedTime()<(AttackConstants.probeConnextionTimeOut+1))
            {
              
                if (AttackConstants.verb=="GET"){
                
                doss.sendGet();
                
                Thread.sleep(AttackConstants.intervalBTreadoperationsfromreceiveBuffer);

                }else {
                
                doss.sendPost();
                
                }
                
            }
           
            
            
            
        }
    
    }
    
   
   
    
    
    
}
