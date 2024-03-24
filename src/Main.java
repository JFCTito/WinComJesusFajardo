import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        ARRAY OF LIST OF KEYWORDS
         */
        String[] keywords = {"Pandora", "Pinterest", "Paypal", "Pg&e", "Project free tv", "Priceline", "Press democrat", "Progressive", "Project runway",
                "Proactive", "Programming", "Progeria", "Progesterone", "Progenex", "Procurable", "Processor", "Proud", "Print", "Prank",
                "Bowl", "Owl", "River", "Phone", "Kayak", "Stamps", "Reprobe"};

        /*
        INT VARIABLE OF THE LIMIT NUMBER OF RESULTS
         */
        int limit = 4;

        /*
        STRING OF THE USER INPUT TO DO THE SEARCH
         */
        String userInput = JOptionPane.showInputDialog("Please, type the keywords you're looking for !");

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
            System.out.println("LIST OF KEYWORDS THAT MATCHES YOUR SEARCH !");
            for (String s : searchResult) {
                System.out.println(s);
            }

            /*
            SHOWING MESSAGE OF NO RESULTS
             */
        } else {
            System.out.println("THERE ARE NO MATCHES!");
        }
    }
}