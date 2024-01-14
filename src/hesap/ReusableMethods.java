package hesap;

import java.util.Scanner;
import static hesap.CommondVariables.*;
public class ReusableMethods {
    public static int mainMenu(Scanner input) {

        String yapilacakIslemler="\n *** WELCOME TO THE CALCULATOR *** \n" +
                "\nPlease select from the following " +
                "\n0- Exit: " +
                "\n1- Add " +
                "\n2- Subtract " +
                "\n3- Multiply " +
                "\n4- Divide " +
                "\n5- Sin " +
                "\n6- Cos " +
                "\n7- Tan " +
                "\n8- Sqrt " +
                "\n9- Exponentiation " +
                "\n10-Percent " +
                "\n11-Mod " ;
        System.out.println(yapilacakIslemler);
        int choose = input.nextInt();
        return choose;
    }

    public static void getNumberFromUser(String message){
        System.out.println("Please enter your first number");
        a = input.nextInt();
        System.out.println("Please enter your second number");
        b = input.nextInt();

    }

}
