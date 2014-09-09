/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

/**
 *
 * @author jashan
 */
public class TwoPass {
    
    
    NaiveVar vb = new NaiveVar();
    
    
    public double Mean(double ar[]){
        
        double avg=0;
        
        avg = (vb.SumDigits(ar))/ar.length;
        
        return avg;
    }
    
    public double Difference(double ar[]){
        
        double differ=0;
        double calc;
        for(int i=0; i<ar.length;i++){
        
            calc = ar[i] - Mean(ar);
            differ = differ + (calc*calc)/(ar.length-1);
            
                
        }
        
        return differ;
        
    }
    
}
