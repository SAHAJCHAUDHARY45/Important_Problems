package String;

public class S06_PrintSequence {
    public static void main(String[] args) {
        String sentence = "HELLO WORLD";
        String output = convertToKeypadSequence(sentence);
        System.out.println("Keypad Sequence: " + output);
    }
    public static String convertToKeypadSequence(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toUpperCase().toCharArray()) {
            if (ch == ' ') {
                result.append("0"); // Space is represented as '0'
            } else {
                int index = ch - 'A'; // Find index in KEYPAD array
                result.append(KEYPAD[index]);
            }
        }

        return result.toString();
    }
    // Mapping of characters to mobile keypad sequence
    private static final String[] KEYPAD = {
            "2", "22", "222",      // A, B, C
            "3", "33", "333",      // D, E, F
            "4", "44", "444",      // G, H, I
            "5", "55", "555",      // J, K, L
            "6", "66", "666",      // M, N, O
            "7", "77", "777", "7777",  // P, Q, R, S
            "8", "88", "888",      // T, U, V
            "9", "99", "999", "9999"   // W, X, Y, Z
    };
}
