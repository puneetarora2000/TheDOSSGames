/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

/**
 *
 * @author jashan
 */
public class NaiveVar {
    
    public double SumDigits(double ar[]){
    
    double sum = 0;
    
    for(int i=0;i<ar.length;i++){
       sum = sum +ar[i];
    
    }
    return sum ;
    
    }
    
    public double SumOfSquares(double ar[]){
        
        double square = 0;
        
        for(int i=0;i<ar.length;i++){
            
            square = square + (ar[i]*ar[i]);
            
        }
        
        return square;
    }
    
    
    public double Variance(double ar[])
    {
      double var=0;
      int n = ar.length;
      double sqrxi = SumDigits(ar)*SumDigits(ar);
      var = (SumOfSquares(ar)-(sqrxi/n))/n;
      
      return var;
    }
    
    /*
    public double FinalVariance(double ar[],double ar1[],double ar2[]){
        
        double fvar = (Variance(ar)+Variance(ar1)+Variance(ar2)/3);
        
        return fvar;
        
        
    }
    
    */    
        
        
    public double DisplayDigits(double ar []){
        
        for(int i =0;i<ar.length;i++){
        System.out.println(ar[i]);
        }
        return 0;
    }

    
    
    
    
    
    
}
