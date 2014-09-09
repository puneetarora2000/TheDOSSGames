/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;


/**
 *
 * @author jashan
 */
public class Compensation {
    
    NaiveVar vb = new NaiveVar();
    TwoPass tp = new TwoPass();
    
    
    public double CmpDiff(double ar[],double ar1[])
            
    {
        double var =0;
            var = vb.SumDigits(ar)-vb.SumDigits(ar1);
            
            var = var*var; 
            return var ;
        
       
    }
    
    public double CmpVar(double tempvar){

        double temp[]=new double[1];
        //double tempvar=0;
        
        for(int n=1;n<4;n++){
            
            temp[1]=0;
        
        temp[n] = ((n-2)/(n-1))*temp[n-1];
        tempvar = tempvar + temp[n];
        }
        return tempvar;
        
        
        
    }
    
   
    
    
        
    }


    
