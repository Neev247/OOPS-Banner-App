public class UC3 {

    public static void main(String[] args) {
        // Using String.join() with a 3-space delimiter ("   ") 
        // to efficiently combine the characters for each line.
        System.out.println(String.join("   ", "  *** ", "  *** ", " ***** ", "  **** "));
        System.out.println(String.join("   ", " * * ", " * * ", " * *", " * "));
        System.out.println(String.join("   ", " * * ", " * * ", " * *", " * "));
        System.out.println(String.join("   ", " * * ", " * * ", " ***** ", "  *** "));
        System.out.println(String.join("   ", " * * ", " * * ", " * ", "     * "));
        System.out.println(String.join("   ", " * * ", " * * ", " * ", "     * "));
        System.out.println(String.join("   ", "  *** ", "  *** ", " * ", " **** "));
    }
}