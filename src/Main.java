import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        LIST OF KEYWORDS ARRAY
         */
        String[] keywords = {"Pandora", "Pinterest", "Paypal", "Pg&e", "Project free tv", "Priceline", "Press democrat", "Progressive", "Project runway",
                "Proactive", "Programming", "Progeria", "Progesterone", "Progenex", "Procurable", "Processor", "Proud", "Print", "Prank",
                "Bowl", "Owl", "River", "Phone", "Kayak", "Stamps", "Reprobe"};

        /*
        INT VARIABLE FOR THE LIMIT NUMBER OF THE SEARCH RESULTS
         */
        int limit = 4;

        /*
        USER INPUT AS A STRING VARIABLE TO DO THE SEARCH
         */
        System.out.println("PLEASE, TYPE THE CHARACTERS OF THE KEYWORD YOU'RE LOOKING FOR:");
        Scanner scanner= new Scanner(System.in);
        String userInput = scanner.nextLine();

        /*
        ARRAY WITH THE SEARCH RESULT
         */
        ArrayList<String> searchResult = Search.searchMatchesFromArray(userInput, keywords, limit);

        /*
        IF STATEMENT TO VERIFY IF THERE ARE RESULTS
         */
            /*
            SHOWING MESSAGE OF RESULTS AND PRINTING RESULTS
             */
        if (!searchResult.isEmpty()) {
            System.out.println("LIST OF KEYWORDS THAT MATCHES YOUR SEARCH: ");
            for (String s : searchResult) {
                System.out.println(s);
            }

            /*
            SHOWING MESSAGE OF NO RESULTS
             */
        } else {
            System.out.println("NO MATCHES FOUND!");
        }
    }
}