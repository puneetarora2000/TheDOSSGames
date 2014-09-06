 

package theplay;
 
import static theplay.PlayGround.mainRun;

public class Main {
    
    
    
    
private static final int NB_PLAYERS = 2;
private static final int NB_ITERATIONS = 1000000;

public static void main(String[] args) {

    double totalProfit = 0.0d;
    
    for (int i = 0; i < NB_ITERATIONS; i++) {
    
        // Going for expensive means trying more stratergies which consume more time,money and skills 
        int nbGoingForExpensive = 0;
        
        // Going for BiggerResource = More Time , More Machines , More bandthwith
        for (int j = 0; j < NB_PLAYERS; j++) {
            if ( goForBiggerResource() ) {
                nbGoingForExpensive++;
            } else {
                totalProfit++;
            }
        }
        totalProfit += nbGoingForExpensive > 0 ? 2 : 0;
    }
    
    // Calc ROI return on investment :etc 
    double payoff = totalProfit / (NB_ITERATIONS * NB_PLAYERS);
    System.out.println( "Payoff per player: " + payoff );
} 

    private static boolean goForBiggerResource() {
        
        // Step 1: 
        
        ResouceDefinations rdf = new ResouceDefinations();
      
        boolean flag = false ;
       
        
           flag=   mainRun();
       
        if (flag==true)
        {
        System.out.println("Attacker Success Flags   True");
        System.out.println("Defender Success Flags   False");
            
        }else{
        
        System.out.println("Defender Success Flags   True");
        System.out.println("Attacker Success Flags   False");
            // Relauch Attack
           if (ResouceDefinations.goForBiggerResourceCheat()==true){
               
               System.out.println("Attacker Success Flags   True");
                System.out.println("Defender Success Flags   False");
        
               
           }else{
               
               System.out.println("Defender Success Flags   True");
               System.out.println("Attacker Success Flags   False");
            
           }
        
        
        }
         
        
        
        
        return false;
    
    }
}
