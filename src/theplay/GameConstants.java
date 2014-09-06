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
public class GameConstants {
    
    /*  Pay Off in terms of Currency  */
    public static Currency minPayOff = Currency.QUARTER;
    public static Currency maxPayOff = Currency.DIME;
    public static boolean  PayOffNormalized = true;
    
//-----------------------------------------
   
    public static String  outputfile  = "";
    
    
    
    
    
    //-----------------------------------------
    
    
    
    
    
    public final static int ITERATIONS  = 1000;
    public final static int NumberofPlayers = 2;
    public final static int GameType = 2;
    
    
    
    //-------------Game Response Code ------------Actions Results---
    //------------- Success Flags Code ---------------
    
    public final static int AttackerUnknownStatus = -1;
    public final static int DefenceUnknownStatus = -1;
    
    public final static int AttackerSuccess = 1;
    public final static int DefenceSuccess= 1;
    
    public final static int AttackerFail = 2;
    public final static int DefenceFail =  2;

    public final static int AttackerBusy = 3;
    public final static int DefenceBusy =  3;

    public final static int AttackerIdle = 3;
    public final static int DefenceIdle =  3;

    //-------------Game Response Code ---------------
    
    /* Life Cycle of Attacker , Actions of Attackers 
    
        1) Init 
        2) LauchAttack 
        3) Observation 
        4) Hibernate
        6) ReLauchAttackAternative 
        5) Sleep 
        6) Destroy 
    
    
    
    
    */
    
    
    
    /*
    
    PayOff Design 
    
    Currency usCoin = Currency.DIME;
    switch (usCoin) {
            case PENNY:
                    System.out.println("Penny coin");
                    break;
            case NICKLE:
                    System.out.println("Nickle coin");
                    break;
            case DIME:
                    System.out.println("Dime coin");
                    break;
            case QUARTER:
                    System.out.println("Quarter coin");
    }

 
    
    
    */
    
    
    
}
