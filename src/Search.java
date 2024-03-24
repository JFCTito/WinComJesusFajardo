import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    /*
    METHOD TO SEARCH MATCHES RECEIVING A SEARCH STRING, AN ARRAY OF KEYWORDS AND AN INT LIMIT OF NUMBER OF RESULTS TO RETURN
     */
    public static ArrayList<String> searchMatchesFromArray(String userInput, String[] keywords, int limit) {

        /*
        NEW ARRAY LIST TO STORE THE SEARCH RESULTS
         */
        ArrayList<String> searchResult = new ArrayList<>();

        /*
        SORT THE ARRAY FROM PARAMETER TO ALPHABETIC ORDER
         */
        Arrays.sort(keywords);

        /*
        LOOP TO ITERATE THE KEYWORDS ARRAY AND SEARCH FOR COINCIDENCES AND STORE THEM INTO SEARCH RESULT ARRAY
         */
        for (String keyword : keywords) {

            /*
            IF COINCIDENCE IS FOUND, STORES IT INTO THE SEARCH RESULT ARRAY UNTIL QUANTITY LIMIT IS REACH
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