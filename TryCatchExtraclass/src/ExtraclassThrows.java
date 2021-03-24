//Unchecked exception:
import java.util.Scanner; 

public class ExtraclassThrows {

    /*
    Instituto Tecnologico de Costa Rica

    Ingeniería en Computadores

    Lenguaje: Java
    Version: 15.0.2
    Author: Jose Andres Quiros Guzman.
    Version: 1.0
    Cuorse: Algoritnmos y Estructura de Datos I
    Professor: Jose Isaac Ramirez Herrera
    Last date of modification: 24/03/2021.

    Entry: Two strings.
    Restrictions: --.
    Outout: Write a, write b, answer, numerator and denominator.
    */
    
    public static void main (String[] args) {
        String a, b;                                                                    //Creation of variables.

        Scanner entrya = new Scanner (System.in);                                       //Creation of entry of a variable.
        Scanner entryb = new Scanner (System.in);                                       //Creation of entry of b variable.

        System.out.print ("Write the first number: ");                                  //Ask for the first variable.
        a = entrya.nextLine();                                                          //Entry.
        System.out.print ("Write the second number: ");                                 //Ask for the second variable.
        b = entryb.nextLine();                                                          //Entry.

        int num1 = Integer.parseInt(a);                                                 //Turn string to an int number.
        int num2 = Integer.parseInt(b);                                                 //Turn string to an int number.

        entrya.close();                                                                 //Close the entry.
        entryb.close();                                                                 //Close the entry.

        try {
           Division (num1, num2); 
        } catch (ArithmeticException e){
            System.err.println("The answer is: Is impossible to divide by zero.");
        } finally {
            System.out.println("The numerator a is: " + a);
            System.out.println("The denominator a is: " + b);

        }
    }

public static void Division (int num1, int num2) {
    int result = num1 / num2;
    
    System.out.println("The answer is: " + result);
}
}