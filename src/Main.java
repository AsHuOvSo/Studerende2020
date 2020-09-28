import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 28/09/2020
 */

public class Main {

    public static void main(String[] args) {

        Studerende st1 = new Studerende();
        st1.navn ="Lasse";
        st1.alder = 22;
        st1.by = "Skuderløse";

        Studerende st2 = new Studerende("Asta", 22);

        Studerende st3 = new Studerende("Delal", 20, "Albertslund");

        System.out.println("Choose a student:");
        System.out.println("Lasse");
        System.out.println("Asta");
        System.out.println("Delal");

        Scanner input = new Scanner(System.in);

        String nameToFind = input.nextLine();

        switch(nameToFind) {
            case "Lasse":
                System.out.println(st1.alder + ", " + st1.by + ".");
                break;
            case "Asta":
                System.out.println(st2.alder + ", " + st2.by + ".");
                break;
            case "Delal":
                System.out.println(st3.alder + ", " + st3.by + ".");
                break;
            default:
                System.out.println("ERROR");
        }
    }

}
