/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlo;



/**
 *
 * @author EVA MWANGI
 */
public class MonteCarlo {

    public static double f(double x){
        
      return Math.sin(x);
    
    }
    
    public static double monteCarloSimulation(double a, double b, int iterations){
        
        if(a>b){
            
            return monteCarloSimulation(b,a,iterations);
        
        }
        double sum = 0, y = 0;
        for(int i=1;i<=iterations;i++){
            y=Math.random();
            sum=sum+f(a+((b-a)*y));
        
        }
        
        sum=((b-a)/iterations)*sum;
        return sum;
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
 
        System.out.println("the estimated value for 10 iterations is\t: "+monteCarloSimulation(0,Math.PI,10));
        System.out.println("the estimated value for 20 iterations is\t: "+monteCarloSimulation(0,Math.PI,20));
        System.out.println("the estimated value for 40 iterations is\t: "+monteCarloSimulation(0,Math.PI,40));
        System.out.println("the estimated value for 80 iterations is\t: "+monteCarloSimulation(0,Math.PI,80));
        System.out.println("the estimated value for 160 iterations is\t: "+monteCarloSimulation(0,Math.PI,160));
        System.out.println("====================================================================");
        System.out.println();
            
        //not sure it is working well
       
    
   
    }
    
}
