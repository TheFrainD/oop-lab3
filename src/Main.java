import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the line:");
        String input = scan.nextLine();

        System.out.print("Enter the word: ");
        String replace = scan.nextLine();

        System.out.print("Enter the length: ");
        int length = scan.nextInt();

        System.out.printf("Result:\n%s", StringMutator.replaceWordByLength(input, replace, length));
    }
}
