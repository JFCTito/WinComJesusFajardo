import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    /*
    METHOD TO SEARCH MATCHES RECEIVING A SEARCH STRING, AN ARRAY OF KEYWORDS AND AN INT LIMIT OF NUMBER OF RESULTS TO RETURN
     */
    public static ArrayList<String> searchMatchesFromArray(String userInput, String[] keywords, int limit) {

        /*
        NEW ARRAY LIST TO STORE SEARCH RESULTS
         */
        ArrayList<String> searchResult = new ArrayList<>();

        /*
        SORT THE ARRAY FROM PARAMETER TO ALPHABETIC ORDER
         */
        Arrays.sort(keywords);

        /*
        LOOP TO ITERATE THROUGH THE KEYWORDS ARRAY, SEARCH FOR MATCHING KEYWORDS, AND STORE THEM IN THE SEARCH RESULT ARRAY
         */
        for (String keyword : keywords) {

            /*
            IF A MATCH IS FOUND, IT STORES IT IN THE SEARCH RESULT ARRAY UNTIL THE LIMIT IS REACHED
             */
            if (keyword.toLowerCase().startsWith(userInput.toLowerCase())) {
                searchResult.add(keyword);
                if (searchResult.size() == limit){
                    break;
                }
            }
        }

        /*
        RETURN THE SEARCH RESULT ARRAY
         */
        return searchResult;
    }
}