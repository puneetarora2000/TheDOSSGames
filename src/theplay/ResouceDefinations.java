/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theplay;

import java.util.Random;

/**
 *
 * @author Ecologic
 */
public class ResouceDefinations {
    
      
 public static boolean goForBiggerResource ()
{
    return Math.random() < 0.2062994740159;
}
    
 
 public static int cheat = 0;

public static boolean goForBiggerResourceCheat()
{
    cheat = (cheat + 1) % 4;
    
   if(ObservationResults()==true){
   
    return cheat == 0;
   }else{
   
    return cheat == 1;
   }
   
}
 

public static int observation = 0;

public static boolean ObservationResults()
{
    Random rnd = new Random();
    
    System.out.println("Under Observation ........");
     observation = rnd.nextInt();
    observation = (observation + 1) % 2;
    if (observation == 0)
    {
    System.out.println("Running Routing Trace : Reverse");
    }
     observation = rnd.nextInt();
    observation = (observation + 1) % 2;
    if (observation == 0)
    {
    System.out.println("Running Ping plotting");
    }
    
     observation = rnd.nextInt();
    observation = (observation + 1) % 2;
    if (observation == 0)
    {
    System.out.println("Running TimeOut ....Observations");
    }
    
    observation = (observation + 1) % 9;
    
    return observation == 0;
    
    
    
}


    
}
