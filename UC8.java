import java.util.HashMap;
import java.util.Map;
public class UC8 {

    public static void main(String[] args) {
        // Initialize the HashMap to store our character-to-pattern mappings
        Map<Character, String[]> patternMap = new HashMap<>();

        // Define and store the pattern for 'O'
        patternMap.put('O', new String[] {
            "  *** ", " * * ", " * * ", " * * ", " * * ", " * * ", "  *** "
        });

        // Define and store the pattern for 'P'
        patternMap.put('P', new String[] {
            " ***** ", " * *", " * *", " ***** ", " * ", " * ", " * "
        });

        // Define and store the pattern for 'S'
        patternMap.put('S', new String[] {
            "  **** ", " * ", " * ", "  *** ", "     * ", "     * ", " **** "
        });

        // The target text to display
        String targetWord = "OOPS";
        String[] bannerLines = new String[7];

        // Construct the banner using StringBuilder and HashMap retrieval
        for (int i = 0; i < 7; i++) {
            StringBuilder rowBuilder = new StringBuilder();
            
            for (int j = 0; j < targetWord.length(); j++) {
                char currentChar = targetWord.charAt(j);
                
                // Efficient lookup using the HashMap
                String[] pattern = patternMap.get(currentChar);
                
                // If the character exists in our map, append its row
                if (pattern != null) {
                    rowBuilder.append(pattern[i]);
                } else {
                    // Fallback spacing if a character isn't in our map
                    rowBuilder.append("       ");
                }
                
                // Add the 3-space delimiter between letters, but not after the last letter
                if (j < targetWord.length() - 1) {
                    rowBuilder.append("   ");
                }
            }
            // Store the fully constructed row
            bannerLines[i] = rowBuilder.toString();
        }

        // Display the final banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}