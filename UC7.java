public class OOPSBannerApp {

    // Static inner class to encapsulate character data and its pattern
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for the character
        public char getCharacter() {
            return character;
        }

        // Getter for the pattern array
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // Define the individual patterns
        String[] patternO = {
            "  *** ", " * * ", " * * ", " * * ", " * * ", " * * ", "  *** "
        };
        String[] patternP = {
            " ***** ", " * *", " * *", " ***** ", " * ", " * ", " * "
        };
        String[] patternS = {
            "  **** ", " * ", " * ", "  *** ", "     * ", "     * ", " **** "
        };

        // Initialize the library of character mappings
        CharacterPatternMap[] library = {
            new CharacterPatternMap('O', patternO),
            new CharacterPatternMap('P', patternP),
            new CharacterPatternMap('S', patternS)
        };

        // The target text to display
        String targetWord = "OOPS";
        String[] bannerLines = new String[7];

        // Construct the banner using StringBuilder for memory efficiency
        for (int i = 0; i < 7; i++) {
            StringBuilder rowBuilder = new StringBuilder();
            
            for (int j = 0; j < targetWord.length(); j++) {
                char currentChar = targetWord.charAt(j);
                
                // Find the matching pattern in our library
                for (CharacterPatternMap mapping : library) {
                    if (mapping.getCharacter() == currentChar) {
                        rowBuilder.append(mapping.getPattern()[i]);
                        
                        // Add the 3-space delimiter between letters, but not after the last letter
                        if (j < targetWord.length() - 1) {
                            rowBuilder.append("   ");
                        }
                        break;
                    }
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
}