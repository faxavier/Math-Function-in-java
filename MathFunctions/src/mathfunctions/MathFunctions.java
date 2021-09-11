/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathfunctions;

/**
 *
 * @author Xavier de Jesus
 */
public class MathFunctions {

    
    public static void main(String[] args) {
        int a=-81;
        // The Math.sqrt(x) method returns the square root of x:
        System.out.println("the square root is "+Math.sqrt(64));
        //The Math.abs(x) method returns the absolute (positive) value of x:
        
        System.out.println("The absolute value of a is "+Math.abs(a));
        
        //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        System.out.println("random number between 0.0 and 1.0 is "+Math.random());
        /*To get more control over the random number, e.g. you only want 
        a random number between 0 and 100, you can use the following formula:*/
        
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println("your number is "+randomNum);
        int b = (int)(Math.random() * 251);  // 0 to 251
        System.out.println("your number rndomly is "+b);
        
        String[] cars = {"Volvo", "BMW", "Ford"};
        System.out.println(cars);
    }
    
}
