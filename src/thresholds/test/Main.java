/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thresholds.test;

import maths.*;
import util.PrintUtil;

/**
 *
 * @author jashan
 */
public class Main {
    
    public static void main(String args[]){
    
        NaiveVar vb = new NaiveVar();
        TwoPass tp = new TwoPass();
        Compensation cmp = new Compensation();
        PrintUtil.PrintLine();
        
        
        double x1[] = {10,15,7,13,20};
        double x2[] = {12,18,9,15,17};
        double x3[] = {20,13,21,14,8};
        
        
        double sum1 = vb.SumDigits(x1);
        double sum2 = vb.SumDigits(x2);
        double sum3 = vb.SumDigits(x3);
        
        double sqr1 = vb.SumOfSquares(x1);
        double sqr2 = vb.SumOfSquares(x2);
        double sqr3 = vb.SumOfSquares(x3);
        
        
        
        vb.DisplayDigits(x1);
        System.out.println("Sum of digits " + sum1);
        System.out.println("Sum of square of digits " + sqr1);
        System.out.println("Variance of digits "+vb.Variance(x1));
        
        
        
        vb.DisplayDigits(x2);
        System.out.println("Sum of digits " + sum2);
        System.out.println("Sum of square of digits " + sqr2);
        System.out.println("Variance of digits "+vb.Variance(x2));
        
        
        
        vb.DisplayDigits(x3);
        System.out.println("Sum of digits " + sum3);
        System.out.println("Sum of square of digits " + sqr3); 
        System.out.println("Variance of digits "+vb.Variance(x3));
    
        double fvar;
        
        fvar = (vb.Variance(x1) + vb.Variance(x2) + vb.Variance(x3))/3;
        
        System.out.println("Naive Value Of given data is " +fvar);
        
   //----------------------------TWO PASS-------------------------------//
        
        double var1 = tp.Difference(Constants.x1);
        System.out.println("TwoPass variance of x1 "+var1);
        
        double var2 = tp.Difference(Constants.x2);
        System.out.println("TwoPass variance of x2 "+var2);
        
        double var3 = tp.Difference(Constants.x3);
        System.out.println("TwoPass variance of x3 "+var3);
        
        
        double ftpvar; // final twopass variance
        
        ftpvar = (var1 + var2 + var3)/3;
        
        System.out.println("TwoPass Value Of given data is " +ftpvar);
        
        double temp =cmp.CmpDiff(x3, x2);
        
        System.out.println("CmpDiffer Value Of given data is " +temp);
        
        
        
    }
    
    
}
