/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example3;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the radius of a circle: ");
       double radius = s.nextDouble();
       double area = radius * radius * 3.14;
       System.out.println("The area is: " + area);
       
    }
    
}
