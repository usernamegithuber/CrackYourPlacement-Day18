package CrackYourPlacementDay18;

public class ReverseWordinaString {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        String[] words = s.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                reversedString.append(words[i]).append(" ");
            }
        }

        return reversedString.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWordinaString reverser = new ReverseWordinaString();
        System.out.println(reverser.reverseWords("the sky is blue")); // Output: "blue is sky the"
        System.out.println(reverser.reverseWords("  hello world  ")); // Output: "world hello"
        System.out.println(reverser.reverseWords("a good   example")); // Output: "example good a"
    }
}
