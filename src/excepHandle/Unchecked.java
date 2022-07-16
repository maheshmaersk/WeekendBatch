package excepHandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unchecked {
    public static void main(String[] args) {
        Scanner sada = new Scanner(System.in);
        try {
            System.out.println("Enter the First Number");
            int numberOne = sada.nextInt();
            System.out.println("Enter the Second Number");
            int numberTwo = sada.nextInt();


            System.out.println("Output is "+ numberOne/numberTwo);
        } catch (ArithmeticException e) {
            System.out.println("Invalid Input");
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            System.out.println("I am Closing");
            sada.close();
        }
    }
}
