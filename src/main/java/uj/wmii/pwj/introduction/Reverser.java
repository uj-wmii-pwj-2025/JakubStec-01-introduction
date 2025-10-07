package uj.wmii.pwj.introduction;

public class Reverser {

    public String reverse(String input) {
        if(input == null) return null;
        String trimmed_input = input.trim();
        return new StringBuilder(trimmed_input).reverse().toString();
    }

    public String reverseWords(String input) {
        if(input == null) return null;

        String trimmed_input = input.trim();
        String[] words = trimmed_input.split("\\s+");
        StringBuilder output = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            output.append(words[i]);
            if(i > 0) {
                output.append(" ");
            }
        }

        return output.toString();
    }

}
