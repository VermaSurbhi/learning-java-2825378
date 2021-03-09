import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime(){
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type any random word and press enter");

        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's time for Developers Tea! Let's have some snacks!");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job");
        announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        announceDeveloperTeaTime();

        System.out.println("Congrats! You're promoted.");
    }

}
