public class UC6 {

    // Static helper method for the letter 'O'
    public static String[] getO() {
        return new String[] {
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        };
    }

    // Static helper method for the letter 'P'
    public static String[] getP() {
        return new String[] {
            " ***** ",
            " * *",
            " * *",
            " ***** ",
            " * ",
            " * ",
            " * "
        };
    }

    // Static helper method for the letter 'S'
    public static String[] getS() {
        return new String[] {
            "  **** ",
            " * ",
            " * ",
            "  *** ",
            "     * ",
            "     * ",
            " **** "
        };
    }

    public static void main(String[] args) {
        // Fetch the character arrays
        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        // Initialize the final banner array
        String[] bannerLines = new String[7];

        // Loop through the 7 lines, joining the specific pieces for O-O-P-S
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join("   ", o[i], o[i], p[i], s[i]);
        }

        // Output the final banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}