import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner inName = new Scanner(System.in);
        System.out.print("What is your name?");
        String aName = inName.nextLine();
        if ((aName.equals("Alice")) || (aName.equals("Bob"))) {
            System.out.print("Hello " + aName + "! How are you?");
        }
        else {
            System.out.print("Bye");
        }
        }
    }
