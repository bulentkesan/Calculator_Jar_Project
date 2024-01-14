package hesap;

import static calculator.Calculator.*;
import static hesap.CommondVariables.*;
import static hesap.ReusableMethods.mainMenu;
public class Calculator {
    public static void main(String[] args) {
        int secim = 0;
        while (secim !=12) {
            secim = mainMenu(input);
                switch (secim) {
                    case 0:
                        System.out.println("Bye Bye");
                        System.exit(0);
                    case 1:
                        ReusableMethods.getNumberFromUser("Add");
                        add(a, b);
                        break;
                    case 2:
                        ReusableMethods.getNumberFromUser("Subtract");
                        subtract(a, b);
                        break;
                    case 3:
                        ReusableMethods.getNumberFromUser("Multiply");
                        multiply(a, b);
                        break;
                    case 4:
                       ReusableMethods.getNumberFromUser("Divide");
                       divide(a, b);
                        break;
                    case 5:
                       ReusableMethods.getNumberFromUser("Sin");
                       sin(a, b);
                        break;
                    case 6:
                      ReusableMethods.getNumberFromUser("Cos");
                      cos(a,b);
                        break;
                    case 7:
                       ReusableMethods.getNumberFromUser("Tan");
                       tan(a,b);
                        break;
                    case 8:
                        ReusableMethods.getNumberFromUser("Sqrt");
                        sqrt(a,b);
                        break;
                    case 9:
                        ReusableMethods.getNumberFromUser("Exponentiation");
                        exponentiation(a,b);
                        break;
                    case 10:
                        ReusableMethods.getNumberFromUser("Percent");
                        percent(a,b);
                        break;
                    case 11:
                        ReusableMethods.getNumberFromUser("Mod");
                        mod(a,b);
                    default:
                        System.out.println("Your transaction is invalid");
                        break;
                }
        }
    }
}


