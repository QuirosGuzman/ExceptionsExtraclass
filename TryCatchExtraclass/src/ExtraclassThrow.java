import java.util.Scanner;

public class ExtraclassThrow {
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
            if (num2 == 0){
                throw new IllegalArgumentException("Is imposible to divide by zero.");
            }else{
                Division (num1, num2); 
            }
        } catch (IllegalArgumentException e){
            System.err.println("The answer is: Is impossible to divide by zero.");
        } finally {
            System.out.println("The numerator a is: " + a);
            System.out.println("The denominator a is: " + b);

        }
    }

public static void Division (int num1, int num2){
    int result = num1 / num2;
    
    System.out.println("The answer is: " + result);
}
}
