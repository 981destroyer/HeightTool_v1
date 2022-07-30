import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class main {
    static double maleChild;
    static double femaleChild;
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        //how tall is the dad?
        System.out.println("How tall is your dad? (in cm)");
        double dadHeight = userInput.nextInt();

        //User Mom height:
        System.out.println("How tall is your mom? (in cm)");
        double momHeight = userInput.nextInt();

        //predicted height:
        femaleChild = dadHeight+momHeight-13;
        maleChild = dadHeight+momHeight+13;

        System.out.println("According to the basic method:");
        System.out.println("Your daughter will be " + femaleChild/2 + "cm tall");
        System.out.println("Your son will be " + maleChild/2 + "cm tall");
    }
}
