import HelperClasses.Helper;

import java.util.Scanner;

public class HelloMain {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        Helper littleHelper = new Helper();
        System.out.println(littleHelper.help(name));
        System.out.println("Test");
        System.out.println("Test2");
                System.out.println("Test3");

    }

}
