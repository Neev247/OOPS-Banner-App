public class UC4 {

    public static void main(String[] args) {
        // Storing the banner lines in a String array
        String[] bannerLines = {
            String.join("   ", "  *** ", "  *** ", " ***** ", "  **** "),
            String.join("   ", " * * ", " * * ", " * *", " * "),
            String.join("   ", " * * ", " * * ", " * *", " * "),
            String.join("   ", " * * ", " * * ", " ***** ", "  *** "),
            String.join("   ", " * * ", " * * ", " * ", "     * "),
            String.join("   ", " * * ", " * * ", " * ", "     * "),
            String.join("   ", "  *** ", "  *** ", " * ", " **** ")
        };

        // Using an enhanced for-loop to iterate through the array and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
