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
 

// Point System , Last Payoff based on Time + Noof Moves --Reward

public enum Currency {
    
        PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
        private int value;

        private Currency(int value) {
                this.value = value;
        }
};  

 