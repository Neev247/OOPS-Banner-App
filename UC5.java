public class UC5 {

    public static void main(String[] args) {
        // Combining array declaration and initialization into a single streamlined statement
        String[] bannerLines = new String[] {
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