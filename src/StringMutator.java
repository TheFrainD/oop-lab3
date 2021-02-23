public class StringMutator {

    private StringMutator() {
    }

    public static String replaceWordByLength(String input, String replace, int length) {
        StringBuffer buffer = new StringBuffer();
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            buffer.append(words[i].replaceAll("\\p{Punct}", "").length() == length ? replace + words[i].replaceAll("[^\\p{Punct}]", "") + " " : words[i] + " ");
        }

        return buffer.toString();
    }
}
