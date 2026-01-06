package logicbuilding;
import java.util.*;

public class InfectedConversations {
    public static int timeToStabilize(String conversation, char infectedCategory) {
        StringBuilder sb = new StringBuilder(conversation);
        int time = 0;

        while (true) {
            List<Integer> toRemove = new ArrayList<>();

            // Identify all infected category indices
            for (int i = 1; i < sb.length(); i++) {
                if (sb.charAt(i) == infectedCategory) {
                    toRemove.add(i - 1); // Mark left neighbor for removal
                }
            }

            // If no terminations occur, break loop
            if (toRemove.isEmpty()) {
                break;
            }

            // Remove marked characters in reverse order to avoid shifting issues
            for (int i = toRemove.size() - 1; i >= 0; i--) {
                sb.deleteCharAt(toRemove.get(i));
            }

            time++; // Increment time step
        }

        return time;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(timeToStabilize("abcdaed", 'd')); // Output: 3
        System.out.println(timeToStabilize("bbbb", 'b'));     // Output: 1
        System.out.println(timeToStabilize("aabba", 'b'));    // Output: 1
        System.out.println(timeToStabilize("zzzyzz", 'y'));   // Output: 1
    }
}
