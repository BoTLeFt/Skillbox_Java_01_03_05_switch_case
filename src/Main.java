import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Input message");
            String input = new Scanner(System.in).nextLine();

            /*if (input.equals("Hello")) {
                System.out.println("Hello");
            } else if (input.equals("How r u?")) {
                System.out.println("Fine, wbu?");
            } else {
                System.out.println("Sadly I have no clue wdym");
            }*/
            switch (input) {
                case "Hello" -> System.out.println("Hello");
                case "How r u?" -> {
                    System.out.println("Fine!");
                    System.out.println("wbu?");
                }
                default -> System.out.println("Sadly I have no clue wdym");
            }
        }
    }
}